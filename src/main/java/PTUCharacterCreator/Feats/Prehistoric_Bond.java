package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Prehistoric_Bond extends Feature {
	{
		name = "Prehistoric Bond";
		tags = "[Paleontology Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Target: The remains of a Fossil you revived Effect: You also produce a Held Item from the remnants of the Fossil. The effect of this Held Item is based on the highest Base Stat of the individual Pokemon being Revived, counting the effects of Nature but no other effects that alter Base Stats. If there is a tie, the GM decides which Base Stat is used. This Held Item may only be used by Pokemon revived from Fossils. HP - Relic Crown: The holder gains a +2 Bonus to all Save Checks. Attack - Primal Frame: The holders damaging attacks have their Critical Hit Range extended by +1. Defense - Prehistoric Razors: When a foe hits the holder with a damaging Melee Attack, the holder may cause them to lose a Tick of Hit Points as a Reaction. Special Attack - Primal Cloak: The holders damaging attacks have their Effect Range extended by +1. Special Defense - Prehistoric Aegis: The holder gains 5 Damage Reduction against Ranged Attacks. Speed - Relic Sash: The holder gains +2 Evasion against Status Moves.";
		prereqs.put("Fossil Restoration", -1);
		prereqs.put("Poke Edu", 5);
	}
	public Prehistoric_Bond(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Fossil Restoration") && t.checkSkillRank("Poke Edu",5);
	}
}