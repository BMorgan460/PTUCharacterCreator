package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Channel_the_Dragons_Spirit extends Feature {
	{
		name = "Channel the Dragon's Spirit";
		tags = "[+Attack]";
		frequency = "1 AP - Free Action ";
		effect = "Trigger: You use a Weapon Attack  Effect: You may have the triggering attack deal Dragon- Type Damage if you wish. On 18+, all targets can only use At-Will Frequency Moves for one full round";
		prereqs.put("Herald of Pride", -1);
	}
	public Channel_the_Dragons_Spirit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Herald of Pride");
	}
}