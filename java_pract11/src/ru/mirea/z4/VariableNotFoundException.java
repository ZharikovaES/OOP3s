package ru.mirea.z4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String text){ super(text); }
}