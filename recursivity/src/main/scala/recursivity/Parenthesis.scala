package recursivity

import scala.annotation.tailrec

object Parenthesis {
  
  def balance(chars: List[Char]): Boolean = {
     def balanced(chars: List[Char], open: Int): Boolean = {
        if (chars.isEmpty) open == 0
            else
                if (chars.head == '(') balanced(chars.tail,open+1)        
                else
                    if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
                    else balanced(chars.tail,open)
    }      
    balanced(chars,0)
  }
}