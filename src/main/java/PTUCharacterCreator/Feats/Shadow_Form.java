package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shadow_Form extends Feature {
	{
		name = "Shadow Form";
		tags = "[+Attack]";
		frequency = "Bind 2 AP - Swift Action";
		effect = "While this Feature is Bound, your appearance becomes wan and obviously otherworldly. Your natural Weaknesses, Resistances, and Immunities change to match that of the Ghost Type. Additionally, while in Shadow Form, you are immune to the Cursed Status (if you were previously Cursed, you are instantly cured upon going into Shadow Form) and gain the Phasing Capability. You may unbind this Feature as a Swift Action, returning to your normal appearance.";
		prereqs.put("Silent Assasin", 0);
		prereqs.put("Ocu Edu", 5);
		prereqs.put("Intimidate", 5);
	}
	public Shadow_Form(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Ocu Edu",5) && t.checkSkillRank("Intimidate",5);
	}
}