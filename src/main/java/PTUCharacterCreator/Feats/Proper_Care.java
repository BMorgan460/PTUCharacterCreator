package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Proper_Care extends Feature {
	{
		name = "Proper Care";
		tags = "[9-15 Playtest]";
		frequency = "Static";
		effect = "You gain additional bonuses to using Restoratives and Features while in a Field Clinic, Poke Center, Hospital, or other dedicated healing space that lets you access supplies.  When you trigger First Aid Expertise here, the injury that is Removed does not count towards the total number of Injuries that may be removed each day. ?? When you trigger Nurse here, Bandages cure 1 Injury after three hours, in addition the injury healed after 6 hours. ?? All Restoratives heal an additional 5 Hit Points. This stacks with the bonus granted by Field Clinic.";
		prereqs.put("I'm a Doctor", 0);
		prereqs.put("Field Clinic", 0);
		prereqs.put("Med Edu", 5);
	}
	public Proper_Care(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Med Edu",5);
	}
}