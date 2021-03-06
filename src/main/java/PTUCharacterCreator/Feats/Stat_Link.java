package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Stat_Link extends Feature {
	{
		name = "Stat Link";
		tags = "[Branch]";
		frequency = "1 AP - Free Action";
		effect = "Trigger: At the end of your Pokemons turn, their Chosen Stat is at its default number of Combat Stages or less Effect: The triggering Pokemon gains +1 Combat Stage in your Chosen Stat. (Note: The ?Default? number of Combat Stages is usually 0)";
		prereqs.put("Stat Ace", -1);
	}
	public Stat_Link(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Stat Ace");
	}
}