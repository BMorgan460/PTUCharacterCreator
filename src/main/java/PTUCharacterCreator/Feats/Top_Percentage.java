package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Top_Percentage extends Feature {
	{
		name = "Top Percentage";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Pokemon levels up to a Level evenly divisible by 5 Effect: Your Pokemon gains an extra Tutor Point. Top Percentage may be used on a single Pokemon a maximum of 4 times. Once a Pokemon has gained 4 Tutor Points in this way, increase each of that Pokemons Base Stats by +1.";
		prereqs.put("Ace Trainer", -1);
		prereqs.put("Command", 5);
	}
	public Top_Percentage(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Ace Trainer") && t.checkSkillRank("Command",5);
	}
}