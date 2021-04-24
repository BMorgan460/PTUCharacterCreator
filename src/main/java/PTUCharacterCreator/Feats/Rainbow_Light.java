package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rainbow_Light extends Feature {
	{
		name = "Rainbow Light";
		tags = "[Artificer Research Field] [Branch]";
		frequency = "2 AP - Standard Action";
		effect = "Condition: You are wearing a Rainbow Gem Effects: You create a Rainbow lasting one full round. While this Rainbow persists, the Effect Range of all Allies is increased by +3. Recipes - Rainbow Gem, Plate Crafter";
		prereqs.put("Crystal Artificer", -1);
		prereqs.put("Ocu Edu", 5);
	}
	public Rainbow_Light(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Crystal Artificer") && t.checkSkillRank("Ocu Edu",5);
	}
}