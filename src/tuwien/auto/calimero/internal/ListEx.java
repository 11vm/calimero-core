/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuwien.auto.calimero.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class ListEx
{
    public static <E> List<E> of()
    {
        return new ArrayList<E>();
    }

    public static <E> List<E> of(E e1)
    {
        List<E> list = new ArrayList<>();
        list.add(e1);
        return list;
    }

    public static <E> List<E> of(E e1, E e2)
    {
        List<E> list = new ArrayList<>();
        list.add(e1); list.add(e2);
        return list;
    }

    public static <E> List<E> of(E e1, E e2, E e3)
    {
        List<E> list = new ArrayList<>();
        list.add(e1); list.add(e2); list.add(e3);
        return list;
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4)
    {
        List<E> list = new ArrayList<>();
        list.add(e1); list.add(e2); list.add(e3); list.add(e4);
        return list;
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5)
    {
        List<E> list = new ArrayList<>();
        list.add(e1); list.add(e2); list.add(e3); list.add(e4); list.add(e5);
        return list;
    }
}
