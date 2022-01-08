
public class AttackCalc {

	private int attackingStat;
	private int basePower; 
    private double mod;
    private int level;
    private int defensiveStat;
    private String defenseType;
    private String attackType;
    private String attackMoveType;
    private String weather;
    private double typeMod;
    private double weatherMod;
    private double crit;
    private boolean criticalHit;
    private double STAB;
    private double randomVal;
    private boolean highCritRatio;

	public AttackCalc(int attackingStat, int defensiveStat, int basePower, double typeMod, double mod, 
			int level, double STAB, double randomVal, double crit, double weatherMod) {
		
		this.mod = mod;
		this.attackingStat = attackingStat;
		this.defensiveStat = defensiveStat;
		this.basePower = basePower;
		this.typeMod = typeMod;
		this.level = level;
		this.STAB = STAB;
		this.randomVal= randomVal;
		this.crit = crit;
		this.weatherMod = weatherMod;
	}
	
	public AttackCalc() {
		
		}
	
    public double typeAdvantageCalc(String defenseType, String attackType)	{
    	//defense = normal cases
    	if(defenseType.equalsIgnoreCase("NORMAL") && attackType.equalsIgnoreCase("FIGHTING"))  {
    			typeMod = 2;
    			}
    	else if(defenseType.equalsIgnoreCase("NORMAL") && attackType.equalsIgnoreCase("GHOST"))  {
    		typeMod = 0;
    		}

    	//defense = fire cases
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 0.5;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("WATER"))  {
    		typeMod = 2;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 0.5;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 2;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 0.5;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 2;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 0.5;
    		}
    	else if(defenseType.equalsIgnoreCase("FIRE") && attackType.equalsIgnoreCase("FAIRY"))  {
    		typeMod = 0.5;
    		}
    	//##########################################################################################################
    	//DEFENSE = WATER CASES
    	else if(defenseType.equalsIgnoreCase("WATER") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("WATER") && attackType.equalsIgnoreCase("WATER"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("WATER") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("WATER") && attackType.equalsIgnoreCase("ELECTRIC"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("WATER") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("WATER") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 0.5;

    		}
    	//##########################################################################################################
    	//DEFENSE = GRASS CASES
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 2;
    	     
    	    }
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("WATER"))  {
    		typeMod = 0.5;

    	    }
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("ELECTRIC"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("FLYING"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GRASS") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 2;

    		}
    	//##########################################################################################################
    	//DEFENSE = ELECTRIC CASES
    	else if(defenseType.equalsIgnoreCase("ELECTRIC") && attackType.equalsIgnoreCase("ELECTRIC"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("ELECTRIC") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("ELECTRIC") && attackType.equalsIgnoreCase("FLYING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("ELECTRIC") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 0.5;

    		}
    	//##########################################################################################################
    	//DEFENSE = ICE CASES
    	else if(defenseType.equalsIgnoreCase("ICE") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("ICE") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("ICE") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("ICE") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("ICE") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 2;

    		}
    	//##########################################################################################################
    	//DEFENSE = FIGHTING CASES
    	else if(defenseType.equalsIgnoreCase("FIGHTING") && attackType.equalsIgnoreCase("FLYING"))  {
    		typeMod = 2;

    		}

    	else if(defenseType.equalsIgnoreCase("FIGHTING") && attackType.equalsIgnoreCase("PSYCHIC"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("FIGHTING") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FIGHTING") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FIGHTING") && attackType.equalsIgnoreCase("DARK"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FIGHTING") && attackType.equalsIgnoreCase("FAIRY"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = POISON
    	else if(defenseType.equalsIgnoreCase("POISON") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("POISON") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("POISON") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("POISON") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("POISON") && attackType.equalsIgnoreCase("PSYCHIC"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("POISON") && attackType.equalsIgnoreCase("FAIRY"))  {
    		typeMod = 0.5;

    		}
    	//DEFENSE = GROUND CASES
    	else if(defenseType.equalsIgnoreCase("GROUND") && attackType.equalsIgnoreCase("WATER"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GROUND") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GROUND") && attackType.equalsIgnoreCase("ELECTRIC"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("GROUND") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GROUND") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("GROUND") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 0.5;

    		}
    	//DEFENSE = FLYING CASES
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("ELECTRIC"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FLYING") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = PSYCHIC CASES
    	else if(defenseType.equalsIgnoreCase("PSYCHIC") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("PSYCHIC") && attackType.equalsIgnoreCase("PSYCHIC"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("PSYCHIC") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("PSYCHIC") && attackType.equalsIgnoreCase("GHOST"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("PSYCHIC") && attackType.equalsIgnoreCase("DARK"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = BUG CASES
    	else if(defenseType.equalsIgnoreCase("BUG") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 2;

    		}

    	else if(defenseType.equalsIgnoreCase("BUG") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("BUG") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("BUG") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("BUG") && attackType.equalsIgnoreCase("FLYING"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("BUG") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = ROCK CASES
    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("NORMAL"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 0.5;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("WATER"))  {
    		typeMod = 2;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 2;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 2;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 0.5;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 2;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("FLYING"))  {
    		typeMod = 0.5;

    		}

    	else if(defenseType.equalsIgnoreCase("ROCK") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = GHOST CASES
    	else if(defenseType.equalsIgnoreCase("GHOST") && attackType.equalsIgnoreCase("NORMAL"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("GHOST") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("GHOST") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("GHOST") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("GHOST") && attackType.equalsIgnoreCase("GHOST"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("GHOST") && attackType.equalsIgnoreCase("DARK"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = DRAGON
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("WATER"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("ELECTRIC"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("DRAGON"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("DRAGON") && attackType.equalsIgnoreCase("FAIRY"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = DARK CASES
    	else if(defenseType.equalsIgnoreCase("DARK") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("DARK") && attackType.equalsIgnoreCase("PSYCHIC"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("DARK") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("DARK") && attackType.equalsIgnoreCase("GHOST"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("DARK") && attackType.equalsIgnoreCase("DARK"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("DARK") && attackType.equalsIgnoreCase("FAIRY"))  {
    		typeMod = 2;

    		}
    	//DEFENSE = STEEL CASES
    	else if(defenseType.equalsIgnoreCase("sTEEL") && attackType.equalsIgnoreCase("NORMAL"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("FIRE"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("GRASS"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("ICE"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("GROUND"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("FLYING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("PSYCHIC"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("ROCK"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("DRAGON"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("STEEL") && attackType.equalsIgnoreCase("FAIRY"))  {
    		typeMod = 0.5;

    		}
    	//DEFENSE = FAIRY CASES
    	else if(defenseType.equalsIgnoreCase("FAIRY") && attackType.equalsIgnoreCase("FIGHTING"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FAIRY") && attackType.equalsIgnoreCase("POISON"))  {
    		typeMod = 2;

    		}
    	else if(defenseType.equalsIgnoreCase("FAIRY") && attackType.equalsIgnoreCase("BUG"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FAIRY") && attackType.equalsIgnoreCase("DRAGON"))  {
    		typeMod = 0;

    		}
    	else if(defenseType.equalsIgnoreCase("FAIRY") && attackType.equalsIgnoreCase("DARK"))  {
    		typeMod = 0.5;

    		}
    	else if(defenseType.equalsIgnoreCase("FAIRY") && attackType.equalsIgnoreCase("STEEL"))  {
    		typeMod = 2;

    		}
    	else {
    		typeMod = 1;
    		}
    	
    	if (typeMod == 1) {
    		System.out.println("Effective!");
    	}
    	else if (typeMod == 0) {
    		System.out.println("Immune!");
    	}
    	else if (typeMod == 0.5) {
    		System.out.println("Not Very Effective!");
    	}
    	else if (typeMod == 2) {
    		System.out.println("Super Effective!!");
    	}

    	return typeMod;
    	/////////////////////////////////////////////////////////////////////////////////////////////////

    	}


//	  private int attackingStat;
//	  private int basePower; 
//    private int typeAd; 
//    private int mod;
//    private int level;
//    private int defensiveStat;
//    private String defenseType;
//    private String attackType;
//    private String attackMoveType;
//    private String weather;
//    private double typeMod;
//    private double weatherMod;
//    private double crit;
//    private boolean criticalHit;
//    private double STAB;
//    private double randomVal;
    
    public double getDamage() {
    	
    	int calc1 = level * 2;
    	double calc2 = calc1/5.0;
    	double calc3 = calc2 + 2;
    	double calc4 = calc3 * basePower;
    	double calc5 = attackingStat/defensiveStat;
    	double calc6 = calc4 * calc5;
    	double calc7 = 2 + (calc6/50);
    	double finalDamage =  (calc7 * randomVal * crit * typeMod * mod * weatherMod * STAB);
    	
    	return finalDamage;
    }
    
    public int getAttackingStat() {
    	return attackingStat;
    
       }
    
    public int getDefensiveStat() {
    	return defensiveStat;
    
       }
    public int getAttackerLevel() {
    	return level;
    
       }
    public double weatherModCalc(String attackType) {
    	if(attackType.equalsIgnoreCase("WATER") && weather.equalsIgnoreCase("RAIN")) {
    		weatherMod = 1.5;
    	}
    	else if(attackType.equalsIgnoreCase("WATER") && weather.equalsIgnoreCase("SUNNY")) {
    		weatherMod = 0.5;
    	}
    	else if(attackType.equalsIgnoreCase("FIRE") && weather.equalsIgnoreCase("SUNNY")) {
    		weatherMod = 1.5;
    	}
    	else if(attackType.equalsIgnoreCase("FIRE") && weather.equalsIgnoreCase("RAIN")) {
    		weatherMod = 0.5;
    	}
    	else {
    		weatherMod = 1;
    	}
    	return weatherMod;
    }
    public double critCalc() {
    	double critCompare = Math.random();
    	if (critCompare <= 0.0625 ) {
    		crit = 1.5;
    		boolean criticalHit = true;
    		}
    	else if (highCritRatio = true && critCompare <= 0.3625 ) {
    		crit = 1.5;
    		boolean criticalHit = true;
    		}
    	else {
    		crit = 1;
    		boolean criticalHit = false;
    	}
    	
    	return crit;
    
       }
    
    
    public boolean getCriticalHit() {
    	return criticalHit;
    
       }
    public double getCrit() {
    	return crit;
    
       }
    public int getattackBasePower() {
    	return basePower;
    	
    }
    public double getSTAB() {
    	if(attackType.equalsIgnoreCase(attackMoveType)) {
    		STAB = 1.5;
    		
    	}
    	else  {
    		STAB = 1;
    		
    	}
    	return STAB;
    }
    	
    public double getrandomVal() {
    	
    	double random = Math.random();
    			
    	if (random <= 0.85 ) {
    		
    		randomVal = 0.85;
    	    		
    	}	
    	
    	else {
    		randomVal = random;
    	}
    			
    	    	return randomVal;
    	    	
   
    	    	

    	
    	
    	
    
    
    	    	
    }
   
    }








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

