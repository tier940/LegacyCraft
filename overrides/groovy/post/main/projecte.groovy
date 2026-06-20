// ProjectE / Project EX / PEEX / EMC Baubles recipe changes

// ── JEI Cleanup ──────────────────────────────────────────────────────────────

// Akuto Engine Klein Stars
mods.jei.ingredient.removeAndHide(item('akutoengine:kleinstarex'))
mods.jei.ingredient.removeAndHide(item('akutoengine:kleinstarex', 1))

// Project EX Final Star
mods.jei.ingredient.removeAndHide(item('projectex:final_star'))

// ── ProjectE ──────────────────────────────────────────────────────────────────

// Watch of Flowing Time
mods.minecraft.crafting.shapedBuilder()
    .output(item('projecte:item.pe_time_watch'))
    .shape([
        [item('projectex:matter', 7), item('minecraft:glowstone'),     item('projectex:matter', 7)],
        [item('minecraft:obsidian'),  item('minecraft:clock'),          item('minecraft:obsidian')],
        [item('projectex:matter', 7), item('minecraft:glowstone'),     item('projectex:matter', 7)]
    ])
    .replace()
    .register()

// ── Project EX ────────────────────────────────────────────────────────────────

// PEEX Collector → Project EX Collector conversions (mk4–mk10)
mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 3))
    .input([item('peex:collectors/collectormk4')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 4))
    .input([item('peex:collectors/collectormk5')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 5))
    .input([item('peex:collectors/collectormk6')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 6))
    .input([item('peex:collectors/collectormk7')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 7))
    .input([item('peex:collectors/collectormk8')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 8))
    .input([item('peex:collectors/collectormk9')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('projectex:collector', 9))
    .input([item('peex:collectors/collectormk10')])
    .register()

// ── PEEX ─────────────────────────────────────────────────────────────────────

// EMC Baubles Necklace → PEEX Collector (strip necklace)
mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk4'))
    .input([item('emcbaubles:collector_mk4_necklace')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk5'))
    .input([item('emcbaubles:collector_mk5_necklace')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk6'))
    .input([item('emcbaubles:collector_mk6_necklace')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk7'))
    .input([item('emcbaubles:collector_mk7_necklace')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk8'))
    .input([item('emcbaubles:collector_mk8_necklace')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk9'))
    .input([item('emcbaubles:collector_mk9_necklace')])
    .register()

mods.minecraft.crafting.shapelessBuilder()
    .output(item('peex:collectors/collectormk10'))
    .input([item('emcbaubles:collector_mk10_necklace')])
    .register()

// PEEX Collector → EMC Baubles Necklace (wrap with string)
def necklacePairs = [
    ['peex:collectors/collectormk4',  'emcbaubles:collector_mk4_necklace'],
    ['peex:collectors/collectormk5',  'emcbaubles:collector_mk5_necklace'],
    ['peex:collectors/collectormk6',  'emcbaubles:collector_mk6_necklace'],
    ['peex:collectors/collectormk7',  'emcbaubles:collector_mk7_necklace'],
    ['peex:collectors/collectormk8',  'emcbaubles:collector_mk8_necklace'],
    ['peex:collectors/collectormk9',  'emcbaubles:collector_mk9_necklace'],
    ['peex:collectors/collectormk10', 'emcbaubles:collector_mk10_necklace']
]
necklacePairs.each { pair ->
    mods.minecraft.crafting.shapedBuilder()
        .output(item(pair[1]))
        .shape([
            [item('minecraft:string'), item('minecraft:string'),  item('minecraft:string')],
            [item('minecraft:string'), item(pair[0]),             item('minecraft:string')],
            [item('minecraft:string'), item('minecraft:string'),  item('minecraft:string')]
        ])
        .register()
}
