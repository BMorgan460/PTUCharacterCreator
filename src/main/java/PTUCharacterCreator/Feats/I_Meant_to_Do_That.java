package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class I_Meant_to_Do_That extends Feature {
	{
		name = "I Meant to Do That";
		tags = "[Gadgeteer Research Field] [Branch] [5-15 Playtest]";
		frequency = "At-Will - Special";
		effect = "Condition: You must have at least one Equipment Item you created with Improvised Gadgets equipped to use this Feature. Effect: Choose one of your equipped items you created with Improved Gadgets. It is destroyed and cannot be repaired, and that instance of Improvised Gadgets is immediately Unbound. Use the effect below corresponding to the Capability granted by the chosen item.  »» Magnetic: You may activate this effect as a Standard Action Interrupt whenever a Steel or Electric-Type attack or an attack with a metal Weapon would hit a target within 5 meters. The attack instead misses all targets within 5 meters. »» Threaded: Choose up to 3 targets within 4 meters and perform an AC 4 Status Attack against them as a Standard Acion. All hit targets become Stuck and Trapped for one full round. »» Zapper: You may activate this effect as a Swift Action upon hitting a foe with a Zapper-modified Struggle Attack. The foe is Paralyzed.";
		prereqs.put("Improvised Gadgets", -1);
		prereqs.put("Tech Edu", 4);
	}
	public I_Meant_to_Do_That(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Improvised Gadgets") && t.checkSkillRank("Tech Edu",4);
	}
}