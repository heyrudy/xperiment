package com.heyrudy.app;

import com.heyrudy.app.helpers.Monad;
import com.heyrudy.app.helpers.Optional;

import java.util.function.Function;

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

        record Item(String name, Price price) {

            record Price(String currency, Integer amount) {
            }
        }

        static Item item = new Item("book", new Item.Price("$", 50));

        static Monad<Item> itemSelection = Optional.Some.of(item);
        static Function<Integer, Monad<Integer>> discountFunction = amount -> Optional.Some.of(amount - 5);

        // can also fmap because Monad is a functor - fmap is a subset of bind.

        static Monad<String> result = itemSelection
                .fmap(Item::price)
                .fmap(Item.Price::amount)
                .bind(discountFunction)
                .fmap(price -> "price: " + price);

        public static void main(String[] args) {
            System.out.println(new Sample.SampleRec<>(5).foo());
            System.out.println(result.get());
        }

        private String foo() {
            return CCC;
        }
    }

    record SampleEx(Inter inter) {

        public static void main(String[] args) {
            System.out.println(new SampleEx(new Sample<>()).foo());
        }

        private String foo() {
            return inter.foo();
        }
    }
}
