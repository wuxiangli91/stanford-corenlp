/* Generated By:JavaCC: Do not edit this line. TregexParserTokenManager.java */
package edu.stanford.nlp.trees.tregex;
// all generated classes are in this package

import edu.stanford.nlp.util.Function;
import edu.stanford.nlp.util.Generics;
import edu.stanford.nlp.util.Pair;
import edu.stanford.nlp.trees.HeadFinder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/** Token Manager. */
class TregexParserTokenManager {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8L) != 0L)
            return 6;
         if ((active0 & 0x40000L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStartNfaWithStates_0(0, 3, 6);
      case 10:
         return jjStopAtPos(0, 11);
      case 33:
         return jjStopAtPos(0, 14);
      case 35:
         return jjStopAtPos(0, 16);
      case 37:
         return jjStopAtPos(0, 17);
      case 38:
         return jjStopAtPos(0, 21);
      case 40:
         return jjStopAtPos(0, 12);
      case 41:
         return jjStopAtPos(0, 13);
      case 61:
         return jjStartNfaWithStates_0(0, 18, 1);
      case 63:
         return jjStopAtPos(0, 22);
      case 64:
         return jjStopAtPos(0, 15);
      case 91:
         return jjStopAtPos(0, 23);
      case 93:
         return jjStopAtPos(0, 24);
      case 95:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 124:
         return jjStopAtPos(0, 20);
      case 126:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 95:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 42;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x8002c84ffffdbffL & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAdd(6);
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     jjCheckNAdd(4);
                  }
                  else if ((0x5400501000000000L & l) != 0L)
                  {
                     if (kind > 4)
                        kind = 4;
                  }
                  else if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 1;
                  if (curChar == 62)
                     jjCheckNAddStates(3, 14);
                  else if (curChar == 60)
                     jjCheckNAddStates(15, 26);
                  else if (curChar == 44)
                     jjCheckNAddTwoStates(20, 23);
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(18, 23);
                  else if (curChar == 36)
                     jjCheckNAddStates(27, 34);
                  else if (curChar == 45)
                     jjCheckNAdd(4);
                  break;
               case 1:
                  if (curChar == 61 && kind > 4)
                     kind = 4;
                  break;
               case 2:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 45)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(4);
                  break;
               case 5:
                  if ((0x8002c84ffffdbffL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0xbff2c84ffffdbffL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(6);
                  break;
               case 7:
               case 8:
                  if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 10:
                  if ((0xffff7fffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if (curChar == 47 && kind > 9)
                     kind = 9;
                  break;
               case 13:
                  if (curChar == 36)
                     jjCheckNAddStates(27, 34);
                  break;
               case 14:
                  if (curChar == 43 && kind > 4)
                     kind = 4;
                  break;
               case 15:
                  if (curChar == 43)
                     jjCheckNAdd(14);
                  break;
               case 16:
                  if (curChar == 45 && kind > 4)
                     kind = 4;
                  break;
               case 17:
                  if (curChar == 45)
                     jjCheckNAdd(16);
                  break;
               case 18:
                  if (curChar == 46 && kind > 4)
                     kind = 4;
                  break;
               case 19:
                  if (curChar == 46)
                     jjCheckNAdd(18);
                  break;
               case 20:
                  if (curChar == 44 && kind > 4)
                     kind = 4;
                  break;
               case 21:
                  if (curChar == 44)
                     jjCheckNAdd(20);
                  break;
               case 22:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(18, 23);
                  break;
               case 23:
                  if (curChar == 43 && kind > 5)
                     kind = 5;
                  break;
               case 24:
                  if (curChar == 44)
                     jjCheckNAddTwoStates(20, 23);
                  break;
               case 25:
                  if (curChar == 60)
                     jjCheckNAddStates(15, 26);
                  break;
               case 26:
                  if (curChar == 60 && kind > 4)
                     kind = 4;
                  break;
               case 27:
                  if (curChar == 60)
                     jjCheckNAdd(20);
                  break;
               case 28:
                  if (curChar == 60)
                     jjCheckNAdd(16);
                  break;
               case 30:
                  if (curChar == 60)
                     jjCheckNAdd(29);
                  break;
               case 31:
                  if (curChar == 58 && kind > 4)
                     kind = 4;
                  break;
               case 32:
                  if (curChar == 60)
                     jjCheckNAdd(31);
                  break;
               case 33:
                  if (curChar == 35 && kind > 4)
                     kind = 4;
                  break;
               case 34:
                  if (curChar == 60)
                     jjCheckNAdd(33);
                  break;
               case 35:
                  if (curChar == 62)
                     jjCheckNAddStates(3, 14);
                  break;
               case 36:
                  if (curChar == 62 && kind > 4)
                     kind = 4;
                  break;
               case 37:
                  if (curChar == 62)
                     jjCheckNAdd(20);
                  break;
               case 38:
                  if (curChar == 62)
                     jjCheckNAdd(16);
                  break;
               case 39:
                  if (curChar == 62)
                     jjCheckNAdd(29);
                  break;
               case 40:
                  if (curChar == 62)
                     jjCheckNAdd(31);
                  break;
               case 41:
                  if (curChar == 62)
                     jjCheckNAdd(33);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xafffffff57fffffeL & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAdd(6);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAdd(12);
                  }
                  break;
               case 5:
                  if ((0xafffffff57fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0xbfffffffd7fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(6);
                  break;
               case 9:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  jjAddStates(0, 2);
                  break;
               case 12:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(12);
                  break;
               case 29:
                  if (curChar == 96 && kind > 4)
                     kind = 4;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = curChar >> 8;
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 6:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(6);
                  break;
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 42 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 10, 11, 36, 37, 38, 20, 16, 29, 39, 31, 40, 33, 41, 23, 26, 
   27, 28, 20, 16, 29, 30, 31, 32, 33, 34, 23, 15, 17, 14, 16, 18, 
   19, 20, 21, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return (jjbitVec2[i2] & l2) != 0L;
      default :
          return (jjbitVec0[i1] & l1) != 0L;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\137\137", null, null, "\12", 
"\50", "\51", "\41", "\100", "\43", "\45", "\75", "\176", "\174", "\46", "\77", 
"\133", "\135", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[42];
private final int[] jjstateSet = new int[84];
protected char curChar;
/** Constructor. */
public TregexParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public TregexParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 42; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t;
   String curTokenImage;
   int beginLine;
   int endLine;
   int beginColumn;
   int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = im == null ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState;
int defaultLexState;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

    for (; ; ) {
        try {
            curChar = input_stream.BeginToken();
        } catch (java.io.IOException e) {
            jjmatchedKind = 0;
            matchedToken = jjFillToken();
            return matchedToken;
        }

        try {
            input_stream.backup(0);
            while (curChar <= 32 && (0x100002000L & 1L << curChar) != 0L)
                curChar = input_stream.BeginToken();
        } catch (java.io.IOException e1) {
            continue;
        }
        jjmatchedKind = 0x7fffffff;
        jjmatchedPos = 0;
        curPos = jjMoveStringLiteralDfa0_0();
        if (jjmatchedKind != 0x7fffffff) {
            if (jjmatchedPos + 1 < curPos)
                input_stream.backup(curPos - jjmatchedPos - 1);
            if ((jjtoToken[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 077)) == 0L) {
                continue;
            } else {
                matchedToken = jjFillToken();
                return matchedToken;
            }
        }
        int error_line = input_stream.getEndLine();
        int error_column = input_stream.getEndColumn();
        String error_after = null;
        boolean EOFSeen = false;
        try {
            input_stream.readChar();
            input_stream.backup(1);
        } catch (java.io.IOException e1) {
            EOFSeen = true;
            error_after = curPos <= 1 ? "" : input_stream.GetImage();
            if (curChar == '\n' || curChar == '\r') {
                error_line++;
                error_column = 0;
            } else
                error_column++;
        }
        if (!EOFSeen) {
            input_stream.backup(1);
            error_after = curPos <= 1 ? "" : input_stream.GetImage();
        }
        throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
    }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
