package com.example.quepokemono.model;

import java.util.List;

/**
 * Represents a Pokémon entity with its associated attributes.
 * <p>
 * This model contains basic information about a Pokémon, such as its ID, name, types, abilities, and stats.
 * The class is designed to map the response from the external Pokémon API.
 * </p>
 */
public class Pokemon {
    private int id;
    private String name;
    private List<TypeSlot> types;
    private List<AbilitySlot> abilities;
    private List<StatSlot> stats;

    // Getters and setters

    /**
     * Represents the type of a Pokémon in a specific slot.
     * <p>
     * Each Pokémon has a list of types that define its elemental attributes (e.g., Water, Fire, Grass).
     * This nested class maps a Pokémon's type data from the external API.
     * </p>
     */
    public static class TypeSlot {
        private int slot;
        private Type type;

        // Getters and setters
    }

    /**
     * Represents an ability of a Pokémon in a specific slot.
     * <p>
     * Each Pokémon can have multiple abilities, some of which may be hidden or specific to certain conditions.
     * This nested class maps a Pokémon's ability data from the external API.
     * </p>
     */
    public static class AbilitySlot {
        private boolean is_hidden;
        private int slot;
        private Ability ability;

        // Getters and setters
    }

    /**
     * Represents a stat of a Pokémon in a specific slot.
     * <p>
     * Stats define the Pokémon's physical and combat attributes (e.g., HP, Attack, Defense).
     * This nested class maps a Pokémon's stat data from the external API.
     * </p>
     */
    public static class StatSlot {
        private int base_stat;
        private int effort;
        private Stat stat;

        // Getters and setters
    }
}