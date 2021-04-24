package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Haunted_Wounds extends Feature {
	{
		name = "Haunted Wounds";
		tags = "[+Attack] [Weapon]";
		frequency = "Scene x2 - Free Action";
		effect = "Trigger: You hit with an Apparition Move or Ghost- Typed Weapon Attack Effect: After one full round, repeat the triggering attack against one target as a Free Action, regardless of range. If this attack hits, it deals damage as if it were resisted one step further. Haunted Wounds may only affect a target once per Scene.";
		prereqs.put("Shadow Arms", -1);
		prereqs.put("Ocu Edu", 6);
		prereqs.put("Intimidate", 6);
	}
	public Haunted_Wounds(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Shadow Arms") && t.checkSkillRank("Ocu Edu",6) && t.checkSkillRank("Intimidate",6);
	}
}