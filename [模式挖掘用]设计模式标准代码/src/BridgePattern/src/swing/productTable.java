package BridgePattern.src.swing;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
//swing classes
import  javax.swing.text.*;
import  javax.swing.*;
import  javax.swing.event.*;
import  javax.swing.tree.*;
import  javax.swing.border.*;
import  javax.swing.table.*;

public class productTable extends JScrollPane
{
   JTable table;
   public productTable(Vector list)
   {
      table = new JTable(new prodModel(list));
      getViewport().add(table);
   }
}
class prodModel implements TableModel
{
   int rows, columns;
   Vector prodNames, quantities;

   public prodModel(Vector products)
   {
      rows  = products.size();
      columns = 2;
      prodNames = new Vector();
      quantities =  new Vector();
      for(int i=0; i< products.size(); i++)
      {
         String s = (String)products.elementAt(i);
         int index = s.indexOf("--");  //separate qty from name
         if(index > 0)
            {
            prodNames.addElement(s.substring(0, index));
            quantities.addElement(s.substring(index+2).trim());
            }
         else
            prodNames.addElement(s);

      }
   }
   public int getColumnCount()
   {
      return columns;
   }
   public int getRowCount()
   {
      return rows;
   }
   public Object getValueAt(int r, int c)
   {
      switch (c)
      {
      case 0:
         return prodNames.elementAt(r);

      case 1:
         return quantities.elementAt(r);

      default:
         return prodNames.elementAt(r);

      }

   }
   public Class getColumnClass(int c)
   {
      return (new String("")).getClass();
   }
   public boolean isCellEditable(int r, int c){return false;}
   public String getColumnName(int c){return "";}
   public void setValueAt(Object obj, int r, int c){}
   public void addTableModelListener(TableModelListener tbm){}
   public void removeTableModelListener(TableModelListener tbm){}
}
