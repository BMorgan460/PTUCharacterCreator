package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Calculated_Assault extends Feature {
	{
		name = "Calculated Assault";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Pokemon uses a Smart-Type Move Contest Effect: Treat the Move as if it were one step more aligned with the Contest Type. If the Move would be opposing the Contest Type, it is instead neutral. If it is neutral, it is instead matching. You may activate this effect only once per Contest. Battle Effect: Choose one: The triggering Pokemon gains a +1 bonus on its Accuracy Roll for each ally that hit a target of its Move this round, or all allies get a +1 bonus to their Accuracy Rolls against targets of the triggering Pokemons Move until the end of your Pokemons next turn. You may activate Calculated Assault only once per Pokemon per Scene.";
		prereqs.put("Smart Scheme Rank 1", -1);
	}
	public Calculated_Assault(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Smart Scheme Rank 1");
	}
}