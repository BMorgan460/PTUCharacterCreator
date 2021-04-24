package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Macho_Charge extends Feature {
	{
		name = "Macho Charge";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Pokemon uses a Tough-Type Move Contest Effect: Treat the Move as if it were one step more aligned with the Contest Type. If the Move would be opposing the Contest Type, it is instead neutral. If it is neutral, it is instead matching. You may activate this effect only once per Contest. Battle Effect: All targets hit by the Move are pushed away from the triggering Pokemon by 3 meters. You may activate Macho Charge only once per Pokemon per Scene.";
		prereqs.put("Tough Tumble Rank 1", -1);
	}
	public Macho_Charge(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Tough Tumble Rank 1");
	}
}