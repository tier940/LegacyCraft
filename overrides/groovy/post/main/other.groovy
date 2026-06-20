// Miscellaneous recipe changes

// ── EnderStorage ──────────────────────────────────────────────────────────────

// Ender Chest (requires Diamond Ender Chest from Iron Chests)
mods.minecraft.crafting.shapedBuilder()
    .output(item('enderstorage:ender_storage'))
    .shape([
        [item('minecraft:blaze_rod'), item('minecraft:wool'),        item('minecraft:blaze_rod')],
        [item('minecraft:obsidian'), item('ironchest:iron_chest', 6), item('minecraft:obsidian')],
        [item('minecraft:blaze_rod'), item('minecraft:ender_pearl'), item('minecraft:blaze_rod')]
    ])
    .replace()
    .register()

// Ender Tank (requires Obsidian Tank from Iron Tanks)
mods.minecraft.crafting.shapedBuilder()
    .output(item('enderstorage:ender_storage', 1))
    .shape([
        [item('minecraft:blaze_rod'), item('minecraft:wool'),         item('minecraft:blaze_rod')],
        [item('minecraft:obsidian'), item('irontanks:obsidian_tank'), item('minecraft:obsidian')],
        [item('minecraft:blaze_rod'), item('minecraft:ender_pearl'), item('minecraft:blaze_rod')]
    ])
    .replace()
    .register()

// ── Multi Page Chest ──────────────────────────────────────────────────────────

// Multi Page Chest (requires Gold Chest from Iron Chests)
mods.minecraft.crafting.shapedBuilder()
    .output(item('multipagechest:multipagechest'))
    .shape([
        [item('ironchest:iron_chest', 2), ore('plankWood'),            item('ironchest:iron_chest', 2)],
        [ore('plankWood'),               item('minecraft:chest'),      ore('plankWood')],
        [item('ironchest:iron_chest', 2), ore('plankWood'),            item('ironchest:iron_chest', 2)]
    ])
    .replace()
    .register()
