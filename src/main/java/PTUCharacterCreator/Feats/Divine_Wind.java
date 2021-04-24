package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Divine_Wind extends Feature {
	{
		name = "Divine Wind";
		tags = "[+HP]";
		frequency = "2 AP - Free Action - Interrupt";
		effect = "Target: Blessings you generated with a Sage Move Effect: Choose a type of Blessing you can generate with a Sage Move. All Blessings you generated of another type become Blessings of the chosen type. This may not be used to generate more uses of a Blessing than the original Move creates. For example, three Lucky Chant Blessings would become two Reflect or Light Screen Blessings, not three. You may only choose a Blessing type once per Scene.";
		prereqs.put("Sage's Benediction", -1);
		prereqs.put("Ocu Edu", 6);
	}
	public Divine_Wind(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Sage's Benediction") && t.checkSkillRank("Ocu Edu",6);
	}
}