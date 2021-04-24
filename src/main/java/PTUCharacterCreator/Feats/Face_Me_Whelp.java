package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Face_Me_Whelp extends Feature {
	{
		name = "Face Me Whelp";
		tags = "";
		frequency = "Static";
		effect = "While your Pokemon is adjacent to a foe they Marked, that foe gains a -X penalty to Accuracy Rolls and a -10 penalty to Damage Rolls on attacks that do not target the Pokemon that Marked them. X is equal to half your Type-Linked Skill Rank.";
		prereqs.put("Close Quarters Mastery", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Face_Me_Whelp(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Close Quarters Mastery");
	}
}