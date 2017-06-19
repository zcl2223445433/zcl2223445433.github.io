package com.student;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.JComponent;

public class WuFrame extends JComponent implements MouseListener {
	private String s;
	private boolean flag =true;
	
	java.util.List<Point> pointList = new ArrayList<Point>();
	private boolean isHei = true;
	
	public WuFrame(){ 
		this.addMouseListener(this);		
	}
	//绘制内容
	public void paint(Graphics g){
		for(int i=-1;i<10;i++){
			g.drawLine(20,(i*40+60),420,(i*40+60));
			g.drawLine((i*40+60),20,(i*40+60),420);
		}
		//绘制棋子
		for(Point p:pointList){
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(),Point.POINT_SIZE,Point.POINT_SIZE);
		}
	}
	//找点
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println(e.getX()+"\t"+e.getY());
		int x = e.getX();
		int y = e.getY();
		//算出应该在哪条线上
		double xianX =Math.round((x+20)/40.0);
		double xianY =Math.round((y+20)/40.0);
		//System.out.println("第几根线"+xianX+"\t"+Math.round(xianX));
		
		x = ((int) xianX)*40-40;
		y = ((int) xianY)*40-40;
		
		//int x = e.getX()-Point.POINT_SIZE/2;
		//int y = e.getY()-Point.POINT_SIZE/2;
		boolean isHave = false;
		for(Point p:pointList){
			if(p.getX()==x&&p.getY()==y){
				isHave = true;
			}	
		}
		if(!isHave){
			Point point = new Point(x,y);
			if(isHei==true){
				point.setColor(Color.black);			
				isHei = false;
			}else{
				point.setColor(Color.white);
				isHei = true;
			}
			pointList.add(point);
			//用户出发，请求重新绘制
			this.repaint();
			}
		}
		
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	public Point findPoint(int x,int y ){
		for(Point p:pointList){
			if(p.getX() == x&&p.getY() == y){
				//判断坐标是否有相同的。
				return p;
			}
		}
		return null;
	}
		public void isWin(){
		int dongxi = 0;
		int currentX = 0;//当前棋子X位置
		int currentY = 0;
		//东
		for(int nowX =currentX,i = 0;i<5&&nowX<=550;nowX+=20,i++){
			Point point = findPoint(nowX,currentY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				//当前棋子是白子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西
		for(int nowX=currentX-20,i = 0;i<5&&nowX>=0;nowX-=20,i++){
			Point point = findPoint(nowX,currentY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongxi++;
					}else{
						break;
					}
				}
				//当前棋子是黑子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongxi++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongxi>=5){
			if(isHei!=true){
				System.out.println("黑子赢了");
			}else{
				System.out.println("白子赢了");
			}
		}
		int nanbei = 0;
		//南
		for(int nowY =currentY,i = 0;i<5&&nowY<=550;nowY+=20,i++){
			Point point = findPoint(currentX,nowY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						nanbei++;
					}else{
						break;
					}
				}
				//当前棋子是白子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						nanbei++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		
		//北
		for(int nowY=currentY-20,i = 0;i<5&&nowY>=0;nowY-=20,i++){
			Point point = findPoint(currentX,nowY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						nanbei++;
					}else{
						break;
					}
				}
				//当前棋子是黑子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						nanbei++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(nanbei>=5){
			if(isHei!=true){
				System.out.println("黑子赢了");
			}else{
				System.out.println("白子赢了");
			}
		}

		//东北
		
		int dongbeixinan = 0;
		for(int nowX = currentX,nowY = currentY,i=0;nowY>=0&&nowX<=520&&i<5;nowY-=20,nowX+=20,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongbeixinan++;
					}else{
						break;
					}
				}
				//当前棋子是白子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西南
		for(int nowX = currentX-20,nowY = currentY+20,i=0;nowY<=520&&nowX>=0&&i<5;nowY+=20,nowX-=20,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						dongbeixinan++;
					}else{
						break;
					}
				}
				//当前棋子是白子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						dongbeixinan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dongbeixinan>=5){
			if(isHei!=true){
				System.out.println("黑子赢了");
			}else{
				System.out.println("白子赢了");
			}
		}
		//西北
		int xibeidongnan = 0;
		for(int nowX = currentX,nowY = currentY,i=0;nowY>=0&&nowX<=520&&i<5;nowY+=20,nowX+=20,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						xibeidongnan++;
					}else{
						break;
					}
				}
				//当前棋子是白子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						xibeidongnan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//东南
		for(int nowX = currentX-20,nowY = currentY-20,i=0;nowY<=520&&nowX>=0&&i<5;nowY-=20,nowX-=20,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//当前棋子是黑子
				if(isHei!=true){
					if(point.getColor()==Color.black){
						xibeidongnan++;
					}else{
						break;
					}
				}
				//当前棋子是白子
				if(isHei!=false){
					if(point.getColor()==Color.white){
						xibeidongnan++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(xibeidongnan>=5){
			if(isHei!=true){
				System.out.println("黑子赢了");
			}else{
				System.out.println("白子赢了");
			}
		}

		}

}

	 
