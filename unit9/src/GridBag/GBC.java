package GridBag;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GBC extends GridBagConstraints{
	private static final long serialVersionUID = 5793560956442039080L;
	
	public GBC(int gridx,int gridy) {
		this.gridx=gridx;
		this.gridy=gridy;
	}
	
	
	public GBC(int gridx,int gridy,int gridwidth,int gridheight) {
		this.gridx=gridx;
		this.gridy=gridy;
		this.gridwidth=gridwidth;
		this.gridheight=gridheight;
	}
	
	
	/**如果组件没有填充整个区域，可以通过anchor域之指定位置
	 * 
	 * @param anchor
	 * @return
	 */
	public GBC setAnchor(int anchor) {
		this.anchor=anchor;
		return this;
	}
	
	
	/** 如果不希望组件拉伸至整个区域 就应该设置fill约束
	 * 
	 * @param fill
	 * @return
	 */
	
	public GBC setFill(int fill) {
		this.fill=fill;
		return this;
	}
	/**   设置增量域
	 *  
	 * @param weigthx
	 * @param weighty
	 * @return
	 */
	
	public GBC setWeigth(double weigthx,double weighty) {
		this.weightx=weigthx;
		this.weighty=weighty;
		return this;
	}
	
	/**
	 *   外部填充
	 * @param distance
	 * @return
	 */
	public GBC setInsets(int distance) {
		this.insets=new Insets(distance,distance,distance,distance);
		return this;
	}
	
	
	public GBC setInsets(int top,int left,int bottom,int right) { 
		this.insets=new Insets(top,left,bottom,right);
		return this;
	}
	/**   内部填充
	 * 
	 * @param ipadx
	 * @param ipady
	 * @return
	 */
	
	public GBC setIpad(int ipadx,int ipady) {   
		this.ipadx=ipadx;
		this.ipady=ipady;
		return this;
	}
	

}
