package com.lilithsthrone.game.sex.sexActions.universal.dom;

import com.lilithsthrone.game.character.attributes.CorruptionLevel;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.ArousalIncrease;
import com.lilithsthrone.game.sex.Sex;
import com.lilithsthrone.game.sex.SexAreaOrifice;
import com.lilithsthrone.game.sex.SexAreaPenetration;
import com.lilithsthrone.game.sex.SexPace;
import com.lilithsthrone.game.sex.SexParticipantType;
import com.lilithsthrone.game.sex.sexActions.SexAction;
import com.lilithsthrone.game.sex.sexActions.SexActionLimitation;
import com.lilithsthrone.game.sex.sexActions.SexActionType;
import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

/**
 * @since 0.1.69
 * @version 0.1.79
 * @author Innoxia
 */
public class DomSixtyNine {
	
	// Player actions:
	
	public static final SexAction PLAYER_MOUND_SNOG = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaOrifice.VAGINA)),
			SexParticipantType.PITCHER,
			SexPace.DOM_ROUGH,
			null) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		@Override
		public String getActionTitle() {
			return "Snog mound";
		}

		@Override
		public String getActionDescription() {
			return "Roughly snog [npc.name]'s genderless crotch.";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.getActivePartner().hasVagina() && !Sex.getActivePartner().hasPenis();
		}

		@Override
		public String getDescription() {
			return UtilText.returnStringAtRandom(
						"You roughly grind your [pc.lips+] down against [npc.name]'s doll-like mound, forcefully snogging and licking at [npc.her] sensitive crotch as [npc.she] [npc.moansVerb+] beneath you.",
						"[npc.Name] lets out [npc.a_moan+] as you drop your head between [npc.her] [npc.legs], before starting to roughly snog [npc.her] doll-like mound.",
						"Dropping your head down into [npc.name]'s crotch, you roughly grind your mouth against [npc.her] genderless crotch, snogging and licking [npc.her] sensitive mound as [npc.she] [npc.moansVerb+] beneath you.",
						"Pushing your [pc.face] down into [npc.name]'s groin, you start grinding your [pc.lips+] against [npc.her] genderless mound,"
								+ " roughly snogging and licking [npc.her] sensitive crotch as [npc.she] [npc.moansVerb+] beneath you.");
		}
	};
	
	public static final SexAction PLAYER_MOUND_KISSING = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaOrifice.VAGINA)),
			SexParticipantType.PITCHER,
			SexPace.DOM_NORMAL,
			null) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		@Override
		public String getActionTitle() {
			return "Kiss mound";
		}

		@Override
		public String getActionDescription() {
			return "Passionately kiss and lick [npc.name]'s genderless mound.";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.getActivePartner().hasVagina() && !Sex.getActivePartner().hasPenis();
		}

		@Override
		public String getDescription() {
			return UtilText.returnStringAtRandom(
					"You eagerly press your [pc.lips+] down against [npc.name]'s doll-like mound, passionately snogging and licking at [npc.her] sensitive crotch as [npc.she] [npc.moansVerb+] beneath you.",
					"[npc.Name] lets out [npc.a_moan+] as you drop your head between [npc.her] [npc.legs], before starting to passionately snog [npc.her] doll-like mound.",
					"Dropping your head down into [npc.name]'s crotch, you passionately press your mouth against [npc.her] genderless crotch, snogging and licking [npc.her] sensitive mound as [npc.she] [npc.moansVerb+] beneath you.",
					"Pushing your [pc.face] down into [npc.name]'s groin, you start pressing your [pc.lips+] against [npc.her] genderless mound,"
							+ " eagerly snogging and licking [npc.her] sensitive crotch as [npc.she] [npc.moansVerb+] beneath you.");
		}
	};
	
	public static final SexAction PLAYER_GENTLE_MOUND_KISSING = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaOrifice.VAGINA)),
			SexParticipantType.PITCHER,
			SexPace.DOM_GENTLE,
			null) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}
		@Override
		public String getActionTitle() {
			return "Kiss mound";
		}

		@Override
		public String getActionDescription() {
			return "Gently kiss and lick [npc.name]'s genderless mound.";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !Sex.getActivePartner().hasVagina() && !Sex.getActivePartner().hasPenis();
		}

		@Override
		public String getDescription() {
			return UtilText.returnStringAtRandom(
					"You gently press your [pc.lips+] down against [npc.name]'s doll-like mound, planting delicate kisses on [npc.her] sensitive crotch as [npc.she] [npc.moansVerb+] beneath you.",
					"[npc.Name] lets out [npc.a_moan+] as you drop your head between [npc.her] [npc.legs], before starting to gently kiss and lick [npc.her] doll-like mound.",
					"Dropping your head down into [npc.name]'s crotch, you press your mouth against [npc.her] genderless crotch, planting a series of gentle kisses on [npc.her] sensitive mound as [npc.she] [npc.moansVerb+] beneath you.",
					"Pushing your [pc.face] down into [npc.name]'s groin, you start pressing your [pc.lips+] against [npc.her] genderless mound,"
							+ " gently kissing and licking [npc.her] sensitive crotch as [npc.she] [npc.moansVerb+] beneath you.");
		}
	};
	
	// Partner actions:
	
	public static final SexAction PARTNER_MOUND_SNOG = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaOrifice.VAGINA)),
			SexParticipantType.PITCHER,
			null,
			SexPace.SUB_EAGER) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.NPC_ONLY;
		}
		@Override
		public String getActionTitle() {
			return "Snog mound";
		}

		@Override
		public String getActionDescription() {
			return "Passionately snog [pc.name]'s genderless crotch.";
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !Main.game.getPlayer().hasVagina() && !Main.game.getPlayer().hasPenis();
		}

		@Override
		public String getDescription() {
			return UtilText.returnStringAtRandom(
						"[npc.Name] eagerly presses [npc.her] [npc.lips+] up against your doll-like mound, passionately snogging and licking at your sensitive crotch as you squeal and moan above [npc.herHim].",
						"You let out [pc.a_moan+] as you feel [npc.name] start passionately snogging your doll-like mound.",
						"Pushing [npc.her] head up, [npc.name] eagerly presses [npc.her] mouth against your genderless crotch, snogging and licking your sensitive mound as you squeal and cry out in pleasure.",
						"Reaching around and grabbing your [pc.ass+], [npc.name] pulls you down onto [npc.her] [npc.face+],"
								+ " grinding [npc.her] [npc.lips] against your genderless mound as [npc.she] enthusiastically snogs and licks at your sensitive crotch.");
		}
	};
	
	public static final SexAction PARTNER_MOUND_KISSING = new SexAction(
			SexActionType.REQUIRES_NO_PENETRATION_AND_EXPOSED,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.ONE_VANILLA,
			Util.newHashMapOfValues(new Value<>(SexAreaPenetration.TONGUE, SexAreaOrifice.VAGINA)),
			SexParticipantType.PITCHER,
			null,
			SexPace.SUB_NORMAL) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.NPC_ONLY;
		}
		@Override
		public String getActionTitle() {
			return "Kiss mound";
		}
	
		@Override
		public String getActionDescription() {
			return "Gently kiss and lick [npc.name]'s doll-like crotch.";
		}
	
		@Override
		public boolean isBaseRequirementsMet() {
			return !Main.game.getPlayer().hasVagina() && !Main.game.getPlayer().hasPenis();
		}
	
		@Override
		public String getDescription() {
			return UtilText.returnStringAtRandom(
						"[npc.Name] plants a series of delicate kisses on your doll-like mound, causing you to let out [pc.a_moan+] and push your [pc.hips] down against [npc.her] [npc.face+].",
						"You let out [pc.a_moan+] as you feel [npc.name] gently kiss and lick your doll-like crotch.",
						"With delicate care, [npc.name] plants a series of gentle kisses on your genderless mound, causing you to let out [pc.a_moan+].",
						"[npc.Name] gently kisses and licks at your genderless crotch, causing you to let out [pc.a_moan+].");
		}
	};
}
