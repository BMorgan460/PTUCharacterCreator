package PTUCharacterCreator.Abilities;
import PTUCharacterCreator.Ability;
public class Stance_Change extends Ability {
	{
		name = "Stance Change";
		freq = "Static";
		effect = "Trigger: \nEffect: Aegislash has two Stances: Shield Stance and Sword Stance. Its default Stance is Shield Stance. Whenever Aegislash uses a damaging attack, it switches to Sword Stance and swaps its Attack Stat with its Defense and its Special Attack Stat with its Special Defense, without changing Combat Stages. Whenever Aegislash uses King's Shield, Protect, a Status Move that raises Defense Combat Stages, or a Blessing, it switches to Shield Stance and swaps its offensive and defensive Stats back to their original arrangement. Aegislash may also change its Stance as a Full Action.";
	}
	public Stance_Change(){}
}