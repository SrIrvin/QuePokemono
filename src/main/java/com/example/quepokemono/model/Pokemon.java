package com.example.quepokemono.model;

import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private List<TypeSlot> types;
    private List<AbilitySlot> abilities;
    private List<StatSlot> stats;

    // Getters y setters
    public static class TypeSlot {
        private int slot;
        private Type type;

        // Getters y setters
    }

    public static class AbilitySlot {
        private boolean is_hidden;
        private int slot;
        private Ability ability;

        // Getters y setters
    }

    public static class StatSlot {
        private int base_stat;
        private int effort;
        private Stat stat;

        // Getters y setters
    }
}