package com.dianaglobal.Editora.Nosso.Lar.domain;

public enum Genero {
    FICCAO,
    ROMANCE_ESPIRITA;

    @Override
    public String toString() {
        return this.name().replace("_", " ");
    }
}
