package org.camp.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author tsujitatsuya
 * Humanという抽象クラスを作成し、以下を実装してください。

openというabstractな公開メソッドを用意してください。
setCardというArrayListを引数とした、abstractな公開メソッドを用意してください。
checkSumというabstractな公開メソッドを用意してください。
myCardsというArrayListの変数を用意してください。
１で作成した抽象クラスを継承して、以下のクラスを作成してください。

Dealerクラス
Userクラス
まずはDealerクラスを完成させます。

cardsというArrayListの変数を用意し、初期処理でこのcardsに全てのトランプを持たせてください。
dealという公開メソッドを用意し、cardsからランダムで2枚のカードをArrayListにして返却してください。
hitという公開メソッドを用意し、cardsからランダムで1枚のカードをArrayListにして返却してください。
DealerとUser両方に必要な処理を実装し、完成させます。

setCardは、ArrayListで受けたカード情報をmyCardsに追加するように実装してください。
checkSumは、myCardsを確認し、まだカードが必要ならtrue、必要無ければfalseを返却するように実装してください。
openは、myCardsのカードの合計値を返却するように実装してください。
DealerとUserクラスを使って、BlackJackを行ってください。

BlackJackの舞台は、Servletクラスでも、Javaクラスのpublic static void mainでも構いません。
カードのやり取りは自動で構いません、カードの変化と最終結果を表示してください。
 */



abstract class Human {
    
   public static void main(String[] args){

   Dealer A = new Dealer();

ArrayList <Integer>myCards = A.deal();
A.open();


ArrayList <Integer> set = A.hit();


if(A.checkSum()){
A.setCard(set);
A.open();
}else{

}

}

    
    
    
    abstract public int open();
    

    abstract public void setCard(ArrayList<Integer> set);
  
    

    abstract public boolean checkSum();
    
     ArrayList<Integer>myCards = new <Integer>ArrayList ();
    
}
    

 class Dealer extends Human {
     
     
     ArrayList <Integer> Cards = new <Integer> ArrayList();
     
     
      public Dealer(){
          for(int a =1; a <=13; a++){
              for(int b =1; b <= 4; b++){
                  Cards.add(a);
              }
          }

    
     
     }
     
     
     public ArrayList<Integer> deal(){
         
         Random rand = new Random();
      ArrayList<Integer>dealcard =new ArrayList<Integer>();
      
         for(int a =0; a < 2; a++){
             
         
         Integer index = rand.nextInt(Cards.size());
         dealcard.add(Cards.get(index));
         
         }
         
         return dealcard;
      
            
     }
     
     
     public ArrayList<Integer> hit(){
        
        ArrayList<Integer>hitcard = new ArrayList<Integer>();
        
        Random rand = new Random();
        
        Integer index = rand.nextInt(Cards.size());
        hitcard.add(Cards.get(index));
        
         return hitcard;
         
     }
     
     
    @Override
    public int open() {
      int x =0;
      for(int i =0;i <myCards.size(); i++){
          x +=myCards.get(i);
      }
      return x;
    }

    @Override
    public void setCard(ArrayList<Integer> set) {
        
       for(int i =0 ;i < set.size(); i++){
        myCards.add(set.get(i));
         
    }
        
    
    }
    
    
    

    @Override
    public boolean checkSum() {
      
        if(open() < 18){
            return true;
        }else{
            return false;
        }
        
    }
    
}




class User extends Human {

    
    
   
    
    
    @Override
    public int open() {
        
        int x =0;
        for(int i =0; i < myCards.size(); i++ ){
            x += myCards.get(i);
        }
        return x;
         
    }

    @Override
    public void setCard(ArrayList<Integer> set) {
        
        for(int i =0; i < set.size(); i++){
            myCards.add(set.get(i));
        }
        
        
    }

    @Override
    public boolean checkSum() {
        if(open() < 18){
            return true;
        }else{
            return false;
            
        }
    }
    
   
}