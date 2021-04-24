package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Bounce_Shot extends Feature {
	{
		name = "Bounce Shot";
		tags = "[+Speed]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You throw a Poke Ball Effect: After hitting its mark or landing, your Poke Ball bounces 3 meters in any direction. You may have your Poke Ball trigger captures or releases before or after the bounce.";
		prereqs.put("Juggler", -1);
	}
	public Bounce_Shot(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Juggler");
	}
}