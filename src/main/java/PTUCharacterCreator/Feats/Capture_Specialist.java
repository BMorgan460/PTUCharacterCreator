package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Capture_Specialist extends Feature {
	{
		name = "Capture Specialist";
		tags = "[Class][+Speed]";
		frequency = "Static";
		effect = "You gain two Capture Techniques of your choice. You must meet any prerequisites of the Technique. Capture Techniques: Capture Skills, Curve Ball, Devitalizing Throw, Fast Pitch, Snare, Tools of the Trade, Catch Combo, False Strike, Relentless Pursuit";
		prereqs.put("Acrobatics, Athletics, Stealth, or Survival", 3);
                prereqs.put("Guile, or Perception", 3);
	}
	public Capture_Specialist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s1 = {"Acrobatics", "Athletics", "Stealth", "Survival"};
            String[] s2 = {"Perception", "Guile"};
            
            return checkMultipleSkills(t,s1,3,1) && checkMultipleSkills(t,s2,3,1);
	}
}