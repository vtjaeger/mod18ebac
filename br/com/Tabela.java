package br.com;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
public @interface Tabela {
    String name();
}
