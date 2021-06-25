/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
interface First
{
    default void show()
    {
        System.out.println("Default First");
    }
}
interface Second
{
    default void show()
    {
        System.out.println("Default Second");
    }
}