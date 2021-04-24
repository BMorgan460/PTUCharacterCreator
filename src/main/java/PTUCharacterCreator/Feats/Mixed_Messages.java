package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Mixed_Messages extends Feature {
	{
		name = "Mixed Messages";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You learn the Moves Lovely Kiss and Torment.";
		prereqs.put("Provocateur", -1);
		prereqs.put("two Provocateur Skills at Adept Rank", 0);
	}
	public Mixed_Messages(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Guile", "Intimidate"};
		return t.hasFeat("Provocateur") && checkMultipleSkills(t,s,4,2);
	}
}