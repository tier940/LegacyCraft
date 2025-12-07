// ########################################
// # Items
// ########################################
// Marker Plus
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:markerplus'))
    .input(
        item('buildcraftcore:marker_volume'),
        ore('ingotGold') * 7,
        ore('ingotIron') * 8,
        ore('dustRedstone') * 11,
        ore('gemLapis') * 11,
        ore('dustGlowstone') * 4
    )
    .energy(320000)
    .register()

// Status Checker
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:tool'))
    .input(
        ore('gemDiamond') * 4,
        ore('ingotGold') * 16,
        ore('ingotIron') * 24,
        ore('dustRedstone') * 32,
        ore('gemLapis') * 8,
        ore('obsidian') * 4
    )
    .energy(80000)
    .register()

// Liquid Selector
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:tool', 2))
    .input(
        ore('ingotIron') * 64,
        item('minecraft:lava_bucket') * 2,
        item('minecraft:water_bucket') * 2
    )
    .energy(320000)
    .register()

// Quarry Y Setter
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:tool', 3))
    .input(
        ore('ingotGold') * 32,
        item('minecraft:repeater') * 16,
        item('minecraft:comparator') * 8,
        ore('gemQuartz') * 64
    )
    .energy(80000)
    .register()

// List Editor
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:tool', 1).withNbt(['HideFlags': 1]))
    .input(
        ore('gemDiamond') * 4,
        ore('ingotIron') * 16,
        ore('dustRedstone') * 4,
        item('minecraft:dye') * 16,
        item('minecraft:book') * 64,
        item('minecraft:feather') * 2
    )
    .energy(160000)
    .register()

// List Template
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:template').withNbt(['HideFlags': 1]))
    .input(
        item('quarryplus:tool', 1).withNbt(['HideFlags': 1]) * 2,
        ore('chest')
    )
    .energy(80000)
    .register()

// Quarry Torch Module
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:torch_module'))
    .input(
        item('torchmaster:mega_torch') * 4,
        item('ic2:blockmetal', 12) * 28,
        item('minecraft:dispenser') * 16,
        item('minecraft:daylight_detector') * 64,
        item('minecraft:comparator') * 64
    )
    .energy(640000)
    .register()

// Quarry Fuel Module
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:fuel_module_normal'))
    .input(
        item('minecraft:furnace') * 3,
        ore('blockGold') * 16
    )
    .energy(3200)
    .register()



// ########################################
// # Blocks
// ########################################
// Laser Plus
mods.quarryplus.workbench_plus.recipeBuilder()
    .output(item('quarryplus:laserplus'))
    .input(
        item('buildcraftsilicon:laser'),
        ore('gemDiamond' * 14),
        ore('ingotGold' * 32),
        ore('ingotIron' * 8),
        item('minecraft:redstone_block' * 16),
        ore('obsidian' * 30),
        item('buildcraftfactory:tank' * 18)
    )
    .energy(640000)
    .register()

// Quarry Plus
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:quarry'))
    .input(
        item('buildcraftbuilders:quarry'),
        ore('gemDiamond') * 11,
        ore('ingotGold') * 16,
        ore('ingotIron') * 36,
        ore('dustRedstone') * 15,
        ore('enderpearl') * 4
    )
    .energy(320000)
    .register()

// Pump Plus
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:pumpplus'))
    .input(
        item('buildcraftfactory:pump'),
        ore('ingotGold') * 16,
        ore('ingotIron') * 37,
        ore('dustRedstone') * 63,
        item('buildcraftfactory:tank') * 62,
        item('ic2:itemmisc', 350) * 10
    )
    .energy(320000)
    .register()

// MiningWell Plus
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:miningwellplus'))
    .input(
        item('buildcraftfactory:mining_well'),
        ore('gemDiamond') * 2,
        ore('ingotGold') * 6,
        ore('ingotIron') * 19,
        ore('dustRedstone') * 15,
        ore('enderpearl') * 2
    )
    .energy(160000)
    .register()

// Refinery Plus
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:refineryplus'))
    .input(
        item('buildcraftfactory:distiller'),
        ore('gemDiamond') * 32,
        ore('ingotGold') * 20,
        ore('ingotIron') * 20,
        item('buildcraftfactory:tank') * 12,
        ore('dustRedstone') * 30,
        item('minecraft:anvil') * 2,
        ore('obsidian') * 24,
        ore('enderpearl')
    )
    .energy(640000)
    .register()

// Advanced Pump
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:standalonepump'))
    .input(
        item('quarryplus:quarry') * 2,
        item('quarryplus:pumpplus') * 2,
        item('quarryplus:markerplus') * 3
    )
    .energy(3200000)
    .register()

// Chunk Destroyer
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:chunkdestroyer'))
    .input(
        item('quarryplus:quarry') * 3,
        item('quarryplus:pumpplus') * 2,
        item('quarryplus:markerplus') * 3,
        ore('blockDiamond') * 8,
        ore('blockEmerald') * 8,
        item('minecraft:ender_eye') * 64,
        ore('netherStar') * 2,
        item('minecraft:skull', 5)
    )
    .energy(3200000)
    .register()

// Experience Pump for Quarry
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:exppump'))
    .input(
        ore('ingotGold') * 16,
        ore('ingotIron') * 48,
        ore('dustRedstone') * 64,
        item('minecraft:experience_bottle') * 2,
        item('minecraft:hay_block') * 32,
        ore('enderpearl') * 2
    )
    .energy(3200000)
    .register()

// Enchant Mover
mods.buildcraft.assembly_table.recipeBuilder()
    .output(item('quarryplus:enchantmover'))
    .input(
        item('minecraft:enchanting_table'),
        ore('gemDiamond') * 30,
        ore('ingotGold') * 8,
        ore('ingotIron') * 8,
        ore('dustRedstone') * 48,
        ore('obsidian') * 60,
        item('minecraft:anvil') * 2,
        ore('enderpearl') * 2
    )
    .energy(320000)
    .register()
