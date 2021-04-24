package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lessons extends Feature {
	{
		name = "Lessons";
		tags = "";
		frequency = "Daily x3 - Extended Action";
		effect = "You may perform any Mentor Lesson for which you qualify. »» Charm: Empowered Development »» Intimidate: Corrective Learning »» Intuition: Changing Viewpoints »» Pokemon Education: Versatile Teachings";
		prereqs.put("Mentor", -1);
	}
	public Lessons(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Mentor");
	}
}