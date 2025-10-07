// ########################################
// # Blocks
// ########################################
// Solar Panel
mods.jei.ingredient.hide(item('ic2:blockgenerator', 3))
crafting.remove(resource('vrgenerator:vrgenerator.visibleraysolar.visibleray1'))
crafting.shapedBuilder()
        .name('visibleraysolar_1')
        .output(item('vrgenerator:visibleraysolar'))
        .row('CgC')
        .row('gCg')
        .row('BGP')
        .key('C', item('ic2:itemmisc', 12))
        .key('g', ore('blockGlass'))
        .key('B', item('ic2:itemmisc', 451))
        .key('G', item('ic2:blockgenerator'))
        .key('P', item('ic2:itemmisc', 451))
        .register()
crafting.shapedBuilder()
        .name('visibleraysolar_2')
        .output(item('vrgenerator:visibleraysolar'))
        .row('CgC')
        .row('gCg')
        .row('BGP')
        .key('C', item('ic2:itemmisc', 6))
        .key('g', ore('blockGlass'))
        .key('B', item('ic2:itemmisc', 451))
        .key('G', item('ic2:blockgenerator'))
        .key('P', item('ic2:itemmisc', 451))
        .register()

// Solar Turbine
crafting.removeByOutput(item('ic2:blockgenerator', 9))
crafting.shapedBuilder()
        .name('solar_turbine')
        .output(item('ic2:blockgenerator', 9))
        .row('CSC')
        .row('HTH')
        .row('CMC')
        .key('C', item('ic2:itemmisc', 257))
        .key('S', item('vrgenerator:visibleraysolar'))
        .key('H', item('ic2:blockmachinelv', 11))
        .key('T', item('ic2:itemmisc', 304))
        .key('M', item('ic2:blockmachinemv'))
        .register()

// Solar Helmet
crafting.removeByOutput(item('ic2:itemsolarhelmets', 0))
crafting.removeByOutput(item('ic2:itemsolarhelmets', 1))

// LV Solar Panel
mods.jei.ingredient.hide(item('ic2:blockcompactedgenerator', 0))

// MV Solar Panel
mods.jei.ingredient.hide(item('ic2:blockcompactedgenerator', 1))

// HV Solar Panel
mods.jei.ingredient.hide(item('ic2:blockcompactedgenerator', 2))

// [Another] CE Permanent lite generator 512 EU/t
crafting.shapedBuilder()
        .name('ce_permanent_lite_generator')
        .output(item('vrgenerator:visibleraysolar', 8))
        .row('CgC')
        .row('VEV')
        .row('CgC')
        .key('C', item('ic2:itemmisc', 256))
        .key('g', item('minecraft:glowstone'))
        .key('V', item('vrgenerator:visibleraysolar', 3))
        .key('E', item('ic2:blockelectric', 9))
        .register()
