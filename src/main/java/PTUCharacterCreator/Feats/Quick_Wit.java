package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Quick_Wit extends Feature {
	{
		name = "Quick Wit";
		tags = "[+Speed]";
		frequency = "Scene x3 - Swift Action";
		effect = "You may make a Manipulate Maneuver or use a Social Move you know, Frequency allowing.";
		prereqs.put("Provocateur", -1);
		prereqs.put("a Provocateur Skill at Adept Rank", 0);
	}
	public Quick_Wit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Guile", "Intimidate"};
		return t.hasFeat("Provocateur") && checkMultipleSkills(t,s,4,1);
	}
}