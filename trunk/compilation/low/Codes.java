
public class Codes {

	protected Code entitiesCode;
	protected Code resourcesCode;
	
	public Codes(Code ec, Code rc){
		this.entitiesCode = ec;
		this.resourcesCode = rc;
	}
	
	public Code getEntitiesCode(){
		return this.entitiesCode;
	}
	
	public Code getResourcesCode(){
		return this.resourcesCode;
	}
}
