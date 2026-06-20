// IC2 + VRGenerator recipe changes

// Solar Panel (IC2 basic) - remove and hide; replaced by VRGenerator
mods.jei.ingredient.removeAndHide(item('ic2:blockgenerator', 3))
mods.minecraft.crafting.removeByOutput(item('vrgenerator:visibleraysolar'))

// Solar Panel - Copper wire variant
mods.minecraft.crafting.shapedBuilder()
    .output(item('vrgenerator:visibleraysolar'))
    .shape([
        [item('ic2:itemmisc', 12), ore('blockGlass'), item('ic2:itemmisc', 12)],
        [ore('blockGlass'),        item('ic2:itemmisc', 12), ore('blockGlass')],
        [item('ic2:itemmisc', 451), item('ic2:blockgenerator'), item('ic2:itemmisc', 451)]
    ])
    .register()

// Solar Panel - Gold wire variant
mods.minecraft.crafting.shapedBuilder()
    .output(item('vrgenerator:visibleraysolar'))
    .shape([
        [item('ic2:itemmisc', 6), ore('blockGlass'), item('ic2:itemmisc', 6)],
        [ore('blockGlass'),       item('ic2:itemmisc', 6), ore('blockGlass')],
        [item('ic2:itemmisc', 451), item('ic2:blockgenerator'), item('ic2:itemmisc', 451)]
    ])
    .register()

// Solar Turbine
mods.minecraft.crafting.shapedBuilder()
    .output(item('ic2:blockgenerator', 9))
    .shape([
        [item('ic2:itemmisc', 257), item('vrgenerator:visibleraysolar'), item('ic2:itemmisc', 257)],
        [item('ic2:blockmachinelv', 11), item('ic2:itemmisc', 304), item('ic2:blockmachinelv', 11)],
        [item('ic2:itemmisc', 257), item('ic2:blockmachinemv'), item('ic2:itemmisc', 257)]
    ])
    .replace()
    .register()

// Solar Helmet
mods.minecraft.crafting.removeByOutput(item('ic2:itemsolarhelmets'))
mods.minecraft.crafting.removeByOutput(item('ic2:itemsolarhelmets', 1))

// Compact Solar Panels - hide (replaced by VRGenerator lineup)
mods.jei.ingredient.removeAndHide(item('ic2:blockcompactedgenerator'))
mods.jei.ingredient.removeAndHide(item('ic2:blockcompactedgenerator', 1))
mods.jei.ingredient.removeAndHide(item('ic2:blockcompactedgenerator', 2))

// CE Permanent lite generator 512 EU/t
mods.minecraft.crafting.shapedBuilder()
    .output(item('vrgenerator:visibleraysolar', 8))
    .shape([
        [item('ic2:itemmisc', 256), item('minecraft:glowstone'), item('ic2:itemmisc', 256)],
        [item('vrgenerator:visibleraysolar', 3), item('ic2:blockelectric', 9), item('vrgenerator:visibleraysolar', 3)],
        [item('ic2:itemmisc', 256), item('minecraft:glowstone'), item('ic2:itemmisc', 256)]
    ])
    .register()
