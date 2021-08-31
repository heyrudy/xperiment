package com.heyrudy.app;

public sealed class Sample<T>
        implements Inter
        permits Sample.One {

    @Override
    public String foo() {
        return "aaa";
    }

    public T bar() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new Sample<>().foo());
        System.out.println(new Sample<>().bar());
    }

    final class One extends Sample<T> {
    }

    record SampleRec<T extends Number>(int i) {
        static final String CCC = "ccc";

        public static void main(String[] args) {
            System.out.println(new Sample.SampleRec<Integer>(5).foo());
        }

        private String foo() {
            return CCC;
        }
    }
}
