package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Critical_Moment extends Feature {
	{
		name = "Critical Moment";
		tags = "[Orders]";
		frequency = "Scene x2 - Standard Action";
		effect = "Target: Your Pokemon with [Training] Features applied Effect: The bonuses from your Pokemons [Training] are tripled until the end of your next turn.";
		prereqs.put("Elite Trainer", -1);
		prereqs.put("Command", 4);
	}
	public Critical_Moment(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Elite Trainer") && t.checkSkillRank("Command",4);
	}
}