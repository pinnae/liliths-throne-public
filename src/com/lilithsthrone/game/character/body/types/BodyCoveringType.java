package com.lilithsthrone.game.character.body.types;

import java.util.ArrayList;
import java.util.List;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.character.body.valueEnums.CoveringModifier;
import com.lilithsthrone.game.character.body.valueEnums.CoveringPattern;
import com.lilithsthrone.utils.Colour;
import com.lilithsthrone.utils.ColourListPresets;
import com.lilithsthrone.utils.Util;

/**
 * @since 0.1.0
 * @version 0.2.4
 * @author Innoxia
 */
public enum BodyCoveringType {

	// Skin shades go light->dark

	HUMAN(BodyCoveringTemplateFactory.createTopSkin(
			Util.newArrayListOfValues(CoveringPattern.NONE, CoveringPattern.FRECKLED),
			Colour.humanSkinColours)),
	
	ANGEL(BodyCoveringTemplateFactory.createTopSkin(
			Util.newArrayListOfValues(CoveringPattern.NONE),
			Colour.humanSkinColours)),

	ANGEL_FEATHER("a layer of",
			true,
			"feathers",
			"feather",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			CoveringPattern.allHairCoveringPatterns,
			Util.newArrayListOfValues(Colour.FEATHERS_WHITE),
			Colour.allFeatherColours,
			Util.newArrayListOfValues(Colour.FEATHERS_WHITE),
			Colour.allFeatherColours),
	
	DEMON_COMMON(BodyCoveringTemplateFactory.createTopSkin(
			Util.newArrayListOfValues(CoveringPattern.NONE),
			Colour.demonSkinColours)),
	
	IMP(BodyCoveringTemplateFactory.createTopSkin(
			Util.newArrayListOfValues(CoveringPattern.NONE),
			Colour.demonSkinColours)),


	BAT_SKIN(BodyCoveringTemplateFactory.createBottomSkin(Colour.humanSkinColours)),
	
	BAT_FUR(BodyCoveringTemplateFactory.createFurSkinHair(
			Util.newArrayListOfValues(CoveringModifier.SHORT),
			Util.newArrayListOfValues(CoveringPattern.NONE))),
	
	CANINE_FUR(BodyCoveringTemplateFactory.createFurSkinHair(
			Util.newArrayListOfValues(
					CoveringModifier.FLUFFY,
					CoveringModifier.SHORT,
					CoveringModifier.SHAGGY),
			Util.newArrayListOfValues(
					CoveringPattern.NONE,
					CoveringPattern.MARKED,
					CoveringPattern.SPOTTED))),
	
	LYCAN_FUR(BodyCoveringTemplateFactory.createFurSkinHair(Util.newArrayListOfValues(CoveringModifier.SHAGGY), null)),

	FELINE_FUR(BodyCoveringTemplateFactory.createFurSkinHair(
			Util.newArrayListOfValues(
					CoveringModifier.SMOOTH,
					CoveringModifier.FLUFFY),
			Util.newArrayListOfValues(
					CoveringPattern.NONE,
					CoveringPattern.MOTTLED,
					CoveringPattern.SPOTTED,
					CoveringPattern.MARKED,
					CoveringPattern.STRIPED,
					CoveringPattern.HIGHLIGHTS))),

	SQUIRREL_FUR(BodyCoveringTemplateFactory.createFurSkinHair(Util.newArrayListOfValues(CoveringModifier.SMOOTH), null)),
	
	RAT_SKIN(BodyCoveringTemplateFactory.createBottomSkin(Colour.ratSkinColours)),
	
	RAT_FUR(BodyCoveringTemplateFactory.createFurSkinHair(Util.newArrayListOfValues(CoveringModifier.SMOOTH), null)),

	RABBIT_FUR(BodyCoveringTemplateFactory.createFurSkinHair(Util.newArrayListOfValues(CoveringModifier.SMOOTH), null)),
	
	HORSE_HAIR("a layer of",
			false,
			"hair",
			"hair",
			Util.newArrayListOfValues(CoveringModifier.SHORT),
			null,
			Util.newArrayListOfValues(
					CoveringPattern.NONE,
					CoveringPattern.MOTTLED,
					CoveringPattern.SPOTTED,
					CoveringPattern.MARKED,
					CoveringPattern.STRIPED),
			CoveringPattern.allHairCoveringPatterns,
			Colour.naturalFurColours,
			Colour.dyeFurColours,
			Colour.naturalFurColours,
			Colour.dyeFurColours),
	
	REINDEER_FUR(BodyCoveringTemplateFactory.createFurSkinHair(
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			Util.newArrayListOfValues(CoveringPattern.NONE))),
	
	BOVINE_FUR(BodyCoveringTemplateFactory.createFurSkinHair(
			Util.newArrayListOfValues(
					CoveringModifier.SHORT,
					CoveringModifier.SMOOTH),
			Util.newArrayListOfValues(
					CoveringPattern.NONE,
					CoveringPattern.MOTTLED,
					CoveringPattern.SPOTTED,
					CoveringPattern.MARKED))),
	
	DILDO("a layer of", // This colour is set in GameCharacter's getCovering method, based on the colour of the dildo equipped.
			false,
			"silicone",
			"silicone",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			null,
			null,
			ColourListPresets.ALL.getPresetColourList(),
			null,
			ColourListPresets.ALL.getPresetColourList(),
			null),
	
	PENIS(BodyCoveringTemplateFactory.createOrificeSkin(null)),

	ANUS(BodyCoveringTemplateFactory.createOrificeSkin(CoveringPattern.ORIFICE_ANUS)),
	
	MOUTH(BodyCoveringTemplateFactory.createOrificeSkin(CoveringPattern.ORIFICE_MOUTH)),
	
	NIPPLES(BodyCoveringTemplateFactory.createOrificeSkin(CoveringPattern.ORIFICE_NIPPLE)),
	
	VAGINA(BodyCoveringTemplateFactory.createOrificeSkin(CoveringPattern.ORIFICE_VAGINA)),
	

	FIRE(BodyCoveringTemplateFactory.createElemental("flames", CoveringModifier.BLAZING, 
					Colour.COVERING_ORANGE,
					Colour.COVERING_BLUE_LIGHT)),
	
	FIRE_HAIR(BodyCoveringTemplateFactory.createElemental("flames", CoveringModifier.BLAZING, 
			Colour.COVERING_ORANGE,
			Colour.COVERING_BLUE_LIGHT)),
	
	WATER(BodyCoveringTemplateFactory.createElemental("water", CoveringModifier.SHIMMERING, 
			Colour.COVERING_BLUE,
			Colour.COVERING_BLUE_LIGHT)),
	
	WATER_HAIR(BodyCoveringTemplateFactory.createElemental("water", CoveringModifier.SHIMMERING, 
			Colour.COVERING_BLUE,
			Colour.COVERING_BLUE_LIGHT)),

	ICE(BodyCoveringTemplateFactory.createElemental("ice", CoveringModifier.SHIMMERING, Colour.COVERING_BLUE_LIGHT)),
	
	ICE_HAIR(BodyCoveringTemplateFactory.createElemental("ice", CoveringModifier.SHIMMERING, Colour.COVERING_BLUE_LIGHT)),

	AIR(BodyCoveringTemplateFactory.createElemental("vapours", CoveringModifier.SWIRLING, Colour.COVERING_BLUE_LIGHT)),
	
	AIR_HAIR(BodyCoveringTemplateFactory.createElemental("vapours", CoveringModifier.SWIRLING, Colour.COVERING_BLUE_LIGHT)),

	STONE(BodyCoveringTemplateFactory.createElemental("stone", CoveringModifier.MATTE, Colour.COVERING_GREY)),
	
	STONE_HAIR(BodyCoveringTemplateFactory.createElemental("stone", CoveringModifier.MATTE, Colour.COVERING_GREY)),

	RUBBER(BodyCoveringTemplateFactory.createElemental("rubber", CoveringModifier.GLOSSY, Colour.COVERING_BLACK)),
	
	RUBBER_HAIR(BodyCoveringTemplateFactory.createElemental("rubber", CoveringModifier.GLOSSY, Colour.COVERING_BLACK)),

	ARCANE(BodyCoveringTemplateFactory.createElemental("energy", CoveringModifier.SWIRLING, Colour.COVERING_PINK)),
	
	ARCANE_HAIR(BodyCoveringTemplateFactory.createElemental("energy", CoveringModifier.SWIRLING, Colour.COVERING_PINK)),
	
	
	SLIME(BodyCoveringTemplateFactory.createSlime(CoveringPattern.NONE, CoveringPattern.allStandardCoveringPatterns)),

	SLIME_EYE(BodyCoveringTemplateFactory.createSlime(CoveringPattern.EYE_IRISES,
			Util.newArrayListOfValues(CoveringPattern.EYE_IRISES_HETEROCHROMATIC))),
	
	SLIME_PUPILS(BodyCoveringTemplateFactory.createSlime(CoveringPattern.EYE_PUPILS,
			Util.newArrayListOfValues(CoveringPattern.EYE_PUPILS_HETEROCHROMATIC))),
	
	SLIME_SCLERA(BodyCoveringTemplateFactory.createSlime(CoveringPattern.EYE_SCLERA,
			Util.newArrayListOfValues(CoveringPattern.EYE_SCLERA_HETEROCHROMATIC))),
	
	SLIME_HAIR(BodyCoveringTemplateFactory.createSlime(CoveringPattern.NONE, CoveringPattern.allHairCoveringPatterns)),
	
	SLIME_ANUS(BodyCoveringTemplateFactory.createSlime(CoveringPattern.ORIFICE_ANUS, null)),
	
	SLIME_MOUTH(BodyCoveringTemplateFactory.createSlime(CoveringPattern.ORIFICE_MOUTH, null)),
	
	SLIME_NIPPLES(BodyCoveringTemplateFactory.createSlime(CoveringPattern.ORIFICE_NIPPLE, null)),
	
	SLIME_VAGINA(BodyCoveringTemplateFactory.createSlime(CoveringPattern.ORIFICE_VAGINA, null)),
	
	SLIME_PENIS(BodyCoveringTemplateFactory.createSlime(CoveringPattern.NONE, CoveringPattern.allStandardCoveringPatterns)),

	FEATHERS("a layer of",
			true,
			"feathers",
			"feather",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			Util.newArrayListOfValues(
					CoveringPattern.NONE,
					CoveringPattern.MOTTLED,
					CoveringPattern.SPOTTED,
					CoveringPattern.MARKED,
					CoveringPattern.STRIPED),
			CoveringPattern.allHairCoveringPatterns,
			Colour.allFeatherColours,
			null,
			Colour.allFeatherColours,
			null),

	ALLIGATOR_SCALES("a layer of",
			true,
			"scales",
			"scale",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			CoveringPattern.allScalesCoveringPatterns,
			Colour.naturalScaleColours,
			Colour.dyeScaleColours,
			Colour.naturalScaleColours,
			Colour.dyeScaleColours),

	// MISC:
	
	HORN("a layer of",
			false,
			"keratin",
			"keratin",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			null,
			CoveringPattern.allScalesCoveringPatterns,
			Colour.hornColours,
			Colour.dyeHornColours,
			Colour.hornColours,
			Colour.dyeHornColours),

	ANTLER_REINDEER("a layer of",
			false,
			"velvet",
			"velvet",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			null,
			CoveringPattern.allScalesCoveringPatterns,
			Colour.antlerColours,
			Colour.dyeAntlerColours,
			Colour.antlerColours,
			Colour.dyeAntlerColours),

	TONGUE("a layer of",
			false,
			"skin",
			"skin",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			null,
			CoveringPattern.allStandardCoveringPatterns,
			Util.newArrayListOfValues(Colour.ORIFICE_INTERIOR),
			Colour.allSkinColours,
			Util.newArrayListOfValues(Colour.ORIFICE_INTERIOR),
			Colour.allSkinColours),

	// HAIR:

	HAIR_HUMAN(BodyCoveringTemplateFactory.createHeadHair(CoveringModifier.SMOOTH)),
	
	HAIR_ANGEL(BodyCoveringTemplateFactory.createHeadHair(CoveringModifier.SILKEN)),

	HAIR_DEMON(BodyCoveringTemplateFactory.createHeadHair(CoveringModifier.SILKEN)),

	HAIR_IMP(BodyCoveringTemplateFactory.createHeadHair(CoveringModifier.SILKEN)),
	
	HAIR_CANINE_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),

	HAIR_LYCAN_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),

	HAIR_FELINE_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),

	HAIR_HORSE_HAIR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.COARSE)),

	HAIR_REINDEER_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.COARSE)),

	HAIR_BOVINE_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.COARSE)),

	HAIR_SQUIRREL_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),

	HAIR_RAT_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),

	HAIR_RABBIT_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),
	
	HAIR_BAT_FUR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.FURRY)),
	
	HAIR_HARPY("a plume of",
			true,
			"feathers",
			"feather",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			CoveringPattern.allHairCoveringPatterns,
			null,
			Colour.allFeatherColours,
			null,
			Colour.allFeatherColours,
			null),
	
	HAIR_SCALES_ALLIGATOR(BodyCoveringTemplateFactory.createFurHeadHair(CoveringModifier.COARSE)), //Why do alligators have hair?!
	
	
	// BODY HAIR:
	
	BODY_HAIR_HUMAN(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.COARSE)),

	BODY_HAIR_ANGEL(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.SILKEN)),

	BODY_HAIR_DEMON(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.SILKEN)),

	BODY_HAIR_IMP(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.SILKEN)),

	BODY_HAIR_CANINE_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),

	BODY_HAIR_LYCAN_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),

	BODY_HAIR_FELINE_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),

	BODY_HAIR_HORSE_HAIR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.COARSE)),

	BODY_HAIR_REINDEER_HAIR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.COARSE)),

	BODY_HAIR_BOVINE_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.COARSE)),

	BODY_HAIR_SQUIRREL_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),

	BODY_HAIR_RAT_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),

	BODY_HAIR_RABBIT_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),
	
	BODY_HAIR_BAT_FUR(BodyCoveringTemplateFactory.createBodyHair(CoveringModifier.FURRY)),
	
	BODY_HAIR_HARPY("a plume of",
			true,
			"feathers",
			"feather",
			Util.newArrayListOfValues(CoveringModifier.FLUFFY),
			null,
			null,
			CoveringPattern.allHairCoveringPatterns,
			Colour.allFeatherColours,
			null,
			Colour.allFeatherColours,
			null),

	BODY_HAIR_SCALES_ALLIGATOR("a plume of",
			false,
			"scales",
			"scale",
			Util.newArrayListOfValues(CoveringModifier.SMOOTH),
			null,
			null,
			CoveringPattern.allStandardCoveringPatterns,
			Colour.naturalScaleColours,
			Colour.dyeScaleColours,
			Colour.naturalScaleColours,
			Colour.dyeScaleColours),


	
	// EYES:
	
	EYE_HUMAN(BodyCoveringTemplateFactory.createEyeIrisesHeterochromiaNaturallyOccuring()),

	EYE_ANGEL(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_DEMON_COMMON(BodyCoveringTemplateFactory.createEyeIrisesWithCustomColors(
			Colour.naturalDemonIrisColours, Colour.dyeDemonIrisColours)),

	EYE_IMP(BodyCoveringTemplateFactory.createEyeIrisesWithCustomColors(
			Colour.naturalDemonIrisColours, Colour.dyeDemonIrisColours)),
	
	EYE_DOG_MORPH(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_LYCAN(BodyCoveringTemplateFactory.createEyeIrisesWithCustomColors(
			Colour.naturalPredatorIrisColours, Colour.dyePredatorIrisColours)),

	EYE_FELINE(BodyCoveringTemplateFactory.createEyeIrisesWithCustomColors(
			Colour.naturalPredatorIrisColours, Colour.dyePredatorIrisColours)),

	EYE_SQUIRREL(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_RAT(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_RABBIT(BodyCoveringTemplateFactory.createEyeIrises()),
	
	EYE_BAT(BodyCoveringTemplateFactory.createEyeIrises()),
	
	EYE_ALLIGATOR_MORPH(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_HORSE_MORPH(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_REINDEER_MORPH(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_COW_MORPH(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_HARPY(BodyCoveringTemplateFactory.createEyeIrises()),

	EYE_PUPILS("a pair of",
			true,
			"pupils",
			"pupil",
			Util.newArrayListOfValues(CoveringModifier.EYE),
			null,
			Util.newArrayListOfValues(CoveringPattern.EYE_PUPILS),
			Util.newArrayListOfValues(CoveringPattern.EYE_PUPILS_HETEROCHROMATIC),
			Colour.naturalPupilColours,
			Colour.dyePupilColours,
			Colour.naturalPupilColours,
			Colour.dyePupilColours),

	EYE_SCLERA("a pair of",
			true,
			"sclerae",
			"sclera",
			Util.newArrayListOfValues(CoveringModifier.EYE),
			null,
			Util.newArrayListOfValues(CoveringPattern.EYE_SCLERA),
			Util.newArrayListOfValues(CoveringPattern.EYE_SCLERA_HETEROCHROMATIC),
			Colour.naturalScleraColours,
			Colour.dyeScleraColours,
			Colour.naturalScleraColours,
			Colour.dyeScleraColours),
	
	// Fluids:
	
	CUM("",
			false,
			"cum",
			"cum",
			Util.newArrayListOfValues(CoveringModifier.FLUID),
			null,
			Util.newArrayListOfValues(CoveringPattern.FLUID),
			null,
			Util.newArrayListOfValues(Colour.COVERING_WHITE),
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_BROWN,
					Colour.COVERING_BLACK,
					Colour.COVERING_RED,
					Colour.COVERING_BLUE,
					Colour.COVERING_PURPLE,
					Colour.COVERING_GREEN),
			null,
			null),
	
	GIRL_CUM("",
			false,
			"girlcum",
			"girlcum",
			Util.newArrayListOfValues(CoveringModifier.FLUID),
			null,
			Util.newArrayListOfValues(CoveringPattern.FLUID),
			null,
			Util.newArrayListOfValues(Colour.COVERING_CLEAR),
			Util.newArrayListOfValues(
					Colour.COVERING_WHITE,
					Colour.COVERING_BROWN,
					Colour.COVERING_BLACK,
					Colour.COVERING_RED,
					Colour.COVERING_BLUE,
					Colour.COVERING_PURPLE,
					Colour.COVERING_GREEN),
			null,
			null),
	
	MILK("",
			false,
			"milk",
			"milk",
			Util.newArrayListOfValues(CoveringModifier.FLUID),
			null,
			Util.newArrayListOfValues(CoveringPattern.FLUID),
			null,
			Util.newArrayListOfValues(Colour.COVERING_WHITE),
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_BROWN,
					Colour.COVERING_BLACK,
					Colour.COVERING_RED,
					Colour.COVERING_BLUE,
					Colour.COVERING_PURPLE,
					Colour.COVERING_GREEN),
			null,
			null),
	
	// Makeup:
	
	MAKEUP_BLUSHER("a layer of",
			false,
			"blusher",
			"blusher",
			Util.newArrayListOfValues(CoveringModifier.MAKEUP),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			null,
			Util.newArrayListOfValues(Colour.COVERING_NONE),
			Util.newArrayListOfValues(
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK),
			null,
			null),
	
	MAKEUP_EYE_LINER("a layer of",
			false,
			"eye liner",
			"eye liner",
			Util.newArrayListOfValues(CoveringModifier.MAKEUP),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			null,
			Util.newArrayListOfValues(Colour.COVERING_NONE),
			Util.newArrayListOfValues(
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK),
			null,
			null),
	
	MAKEUP_EYE_SHADOW("a layer of",
			false,
			"eye shadow",
			"eye shadow",
			Util.newArrayListOfValues(
					CoveringModifier.MATTE,
					CoveringModifier.SPARKLY,
					CoveringModifier.METALLIC),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			null,
			Util.newArrayListOfValues(Colour.COVERING_NONE),
			Util.newArrayListOfValues(
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK),
			null,
			null),

	MAKEUP_LIPSTICK("a layer of",
			false,
			"lipstick",
			"lipstick",
			Util.newArrayListOfValues(
					CoveringModifier.GLOSSY,
					CoveringModifier.MATTE,
					CoveringModifier.SPARKLY,
					CoveringModifier.METALLIC),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			Util.newArrayListOfValues(
					CoveringPattern.SPOTTED,
					CoveringPattern.STRIPED),
			Util.newArrayListOfValues(Colour.COVERING_NONE),
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK),
			null,
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK)),
	
	MAKEUP_NAIL_POLISH_HANDS("a layer of",
			false,
			"nail polish",
			"nail polish",
			Util.newArrayListOfValues(
					CoveringModifier.SMOOTH,
					CoveringModifier.SPARKLY,
					CoveringModifier.METALLIC),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			Util.newArrayListOfValues(
					CoveringPattern.SPOTTED,
					CoveringPattern.STRIPED),
			Util.newArrayListOfValues(Colour.COVERING_NONE),
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK),
			null,
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK)),
	
	MAKEUP_NAIL_POLISH_FEET("a layer of",
			false,
			"nail polish",
			"nail polish",
			Util.newArrayListOfValues(
					CoveringModifier.SMOOTH,
					CoveringModifier.SPARKLY,
					CoveringModifier.METALLIC),
			null,
			Util.newArrayListOfValues(CoveringPattern.NONE),
			Util.newArrayListOfValues(
					CoveringPattern.SPOTTED,
					CoveringPattern.STRIPED),
			Util.newArrayListOfValues(Colour.COVERING_NONE),
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_AMBER,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK),
			null,
			Util.newArrayListOfValues(
					Colour.COVERING_CLEAR,
					Colour.COVERING_RED,
					Colour.COVERING_RED_DARK,
					Colour.COVERING_ORANGE,
					Colour.COVERING_AMBER,
					Colour.COVERING_BROWN,
					Colour.COVERING_GREEN,
					Colour.COVERING_GREEN_DARK,
					Colour.COVERING_BLUE,
					Colour.COVERING_BLUE_DARK,
					Colour.COVERING_PURPLE,
					Colour.COVERING_PURPLE_DARK,
					Colour.COVERING_PINK,
					Colour.COVERING_PINK_DARK,
					Colour.COVERING_WHITE,
					Colour.COVERING_SILVER,
					Colour.COVERING_BLACK));
	
	private String determiner; 
	private String namePlural;
	private String nameSingular;
	private List<CoveringModifier> naturalModifiers;
	private List<CoveringModifier> extraModifiers;
	private List<Colour> naturalColoursPrimary;
	private List<Colour> dyeColoursPrimary;
	private List<Colour> naturalColoursSecondary;
	private List<Colour> dyeColoursSecondary;
	private List<Colour> allColours;
	private List<Colour> allPrimaryColours;
	private List<Colour> allSecondaryColours;
	private List<CoveringPattern> naturalPatterns;
	private List<CoveringPattern> dyePatterns;
	private List<CoveringPattern> allPatterns;
	private boolean isDefaultPlural;
	
	private BodyCoveringType(BodyCoveringTemplate template) {
		determiner = template.determiner;
		namePlural = template.namePlural;
		nameSingular = template.nameSingular;
		naturalModifiers = template.naturalModifiers;
		extraModifiers = template.extraModifiers;
		naturalColoursPrimary = template.naturalColoursPrimary;
		dyeColoursPrimary = template.dyeColoursPrimary;
		naturalColoursSecondary = template.naturalColoursSecondary;
		dyeColoursSecondary = template.dyeColoursSecondary;
		naturalPatterns = template.naturalPatterns;
		dyePatterns = template.dyePatterns;
		isDefaultPlural = template.isDefaultPlural;
		
		allPatterns = new ArrayList<>();
		allPatterns.addAll(naturalPatterns);
		allPatterns.addAll(dyePatterns);
		
		allColours = new ArrayList<>();
		allColours.addAll(naturalColoursPrimary);
		allColours.addAll(dyeColoursPrimary);
		allColours.addAll(naturalColoursSecondary);
		allColours.addAll(dyeColoursSecondary);
		
		allPrimaryColours = new ArrayList<>();
		allPrimaryColours.addAll(naturalColoursPrimary);
		allPrimaryColours.addAll(dyeColoursPrimary);
		
		allSecondaryColours = new ArrayList<>();
		allSecondaryColours.addAll(naturalColoursSecondary);
		allSecondaryColours.addAll(dyeColoursSecondary);
	}

	private BodyCoveringType(
			String determiner,
			boolean isDefaultPlural,
			String namePlural,
			String nameSingular,
			List<CoveringModifier> naturalModifiers,
			List<CoveringModifier> extraModifiers,
			List<CoveringPattern> naturalPatterns,
			List<CoveringPattern> dyePatterns,
			List<Colour> naturalColoursPrimary,
			List<Colour> dyeColoursPrimary,
			List<Colour> naturalColoursSecondary,
			List<Colour> dyeColoursSecondary) {
		
		this.determiner = determiner;
		this.namePlural = namePlural;
		this.nameSingular=nameSingular;
		this.isDefaultPlural = isDefaultPlural;
		
		if(naturalModifiers == null) {
			this.naturalModifiers = new ArrayList<>();
		} else {
			this.naturalModifiers = naturalModifiers;
		}
		
		if(extraModifiers == null) {
			this.extraModifiers = new ArrayList<>();
		} else {
			this.extraModifiers = extraModifiers;
		}
		
		if(naturalPatterns == null) {
			this.naturalPatterns = new ArrayList<>();
			this.naturalPatterns.add(CoveringPattern.NONE);
		} else {
			this.naturalPatterns = naturalPatterns;
		}

		this.dyePatterns = new ArrayList<>();
		if(dyePatterns != null) {
			this.dyePatterns.addAll(dyePatterns);
			this.dyePatterns.removeAll(this.naturalPatterns);
		}
		
		allPatterns = new ArrayList<>();
		if(naturalPatterns == null) {
			allPatterns.add(CoveringPattern.NONE);
		} else {
			allPatterns.addAll(this.naturalPatterns);
		}
		
		if(dyePatterns != null) {
			allPatterns.addAll(this.dyePatterns);
		}
		
		
		if(naturalColoursPrimary == null) {
			this.naturalColoursPrimary = new ArrayList<>();
		} else {
			this.naturalColoursPrimary = naturalColoursPrimary;
		}
		if(dyeColoursPrimary == null) {
			this.dyeColoursPrimary = new ArrayList<>();
		} else {
			this.dyeColoursPrimary = dyeColoursPrimary;
		}
		
		if(naturalColoursSecondary == null) {
			this.naturalColoursSecondary = new ArrayList<>();
		} else {
			this.naturalColoursSecondary = naturalColoursSecondary;
		}
		if(dyeColoursSecondary == null) {
			this.dyeColoursSecondary = new ArrayList<>();
		} else {
			this.dyeColoursSecondary = dyeColoursSecondary;
		}
		
		allColours = new ArrayList<>();
		allPrimaryColours = new ArrayList<>();
		allSecondaryColours = new ArrayList<>();
		for(Colour c : this.naturalColoursPrimary) {
			allColours.add(c);
			allPrimaryColours.add(c);
//			this.dyeColoursPrimary.remove(c);
		}
		for(Colour c : this.dyeColoursPrimary) {
			allColours.add(c);
			allPrimaryColours.add(c);
		}
		for(Colour c : this.naturalColoursSecondary) {
			allColours.add(c);
			allSecondaryColours.add(c);
//			this.dyeColoursSecondary.remove(c);
		}
		for(Colour c : this.dyeColoursSecondary) {
			allColours.add(c);
			allSecondaryColours.add(c);
		}
	}

	public String getDeterminer(GameCharacter gc) {
		return determiner;
	}

	public boolean isDefaultPlural() {
		return isDefaultPlural;
	}
	
	public String getNameSingular(GameCharacter gc) {
		return nameSingular;
	}
	
	public String getNamePlural(GameCharacter gc) {
		return namePlural;
	}
	
	public String getName(GameCharacter gc){
		if(isDefaultPlural()) {
			return getNamePlural(gc);
		} else {
			return getNameSingular(gc);
		}
	}
	
	public List<CoveringPattern> getNaturalPatterns() {
		return naturalPatterns;
	}

	public List<CoveringPattern> getDyePatterns() {
		return dyePatterns;
	}

	public List<CoveringPattern> getAllPatterns() {
		return allPatterns;
	}
	
	public List<Colour> getNaturalColoursPrimary() {
		return naturalColoursPrimary;
	}

	public List<Colour> getDyeColoursPrimary() {
		return dyeColoursPrimary;
	}

	public List<Colour> getNaturalColoursSecondary() {
		return naturalColoursSecondary;
	}

	public List<Colour> getDyeColoursSecondary() {
		return dyeColoursSecondary;
	}

	public List<Colour> getAllColours() {
		return allColours;
	}
	
	public List<Colour> getAllPrimaryColours() {
		return allPrimaryColours;
	}
	
	public List<Colour> getAllSecondaryColours() {
		return allSecondaryColours;
	}

	public BodyCoveringType getBodyCoveringType() {
		return this;
	}

	public List<CoveringModifier> getNaturalModifiers() {
		return naturalModifiers;
	}

	public List<CoveringModifier> getExtraModifiers() {
		return extraModifiers;
	}
}
