package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Affliction_Techniques extends Feature {
	{
		name = "Affliction Techniques";
		tags = "[Apothecary Research Field] [Branch] [9-15 Playtest]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: You use a Antidote, Burn Heal, Ice Heal, or Paralyze Heal Effect: If the target successfully cures the target of its linked Status Affliction, the item has additional effects. »» Antidote: The target gains +1 Special Defense Combat Stage. »» Burn Heal: The target gains +1 Defense Combat Stage. »» Ice Heal: The target gains +1 Attack or Special Attack Combat Stage »» Paralyze Heal: The target gains +1 Speed Combat Stage.";
		prereqs.put("Patch Cure", -1);
		prereqs.put("Med Edu", 5);
	}
	public Affliction_Techniques(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Patch Cure") && t.checkSkillRank("Med Edu",5);
	}
}