package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Enhanced_Capsules extends Feature {
	{
		name = "Enhanced Capsules";
		tags = "[Gadgeteer Research Field] [Branch] [5-15 Playtest]";
		frequency = "Daily x3 - Extended Action";
		effect = "Target: A willing Pokemon with one of the Capabilities listed below Effect: Choose one of the Capabilities below which the target Pokemon has. You create a consumable item with the effect below, depending on the chosen Capability. All unused items created with Enhanced Capsules are rendered inert after an Extended Rest (including modifications to other items).  »» Glow: This item may be attached to a Wonder Launcher as a Standard Action to give the following effect for the rest of the Scene: Whenever you apply an Item to a target using this Wonder Launcher, that target gains the Illuminate Ability for one full round. »» Magnetic: This item may be loaded into a Cap Cannon to provide two Bean Cap Ammo. When fired, these Bean Caps cannot miss. »» Threaded: This item may be loaded into a Cap Cannon to provide two Glue Cap Ammo. When fired, they affect a Blast 2 instead of a single target. »» Zapper: This item may be loaded into a Cap Cannon as a single Net Cap Ammo. Targets trapped by this Net Cap are Suppressed while trapped. Targets immune to Electric-Type attacks are immune to this effect.";
		prereqs.put("Capsule Science", -1);
		prereqs.put("Tech Edu", 6);
	}
	public Enhanced_Capsules(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Capsule Science") && t.checkSkillRank("Tech Edu",6);
	}
}