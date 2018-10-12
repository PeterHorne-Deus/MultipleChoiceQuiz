/*
 * Peter Horne-Deus
 * MultipleChoiceQuiz.java
 * This is a multiple choice quiz program
 * October 11,2018
 */

package multipleChoiceQuiz;

import java.awt.Color;
import java.text.DecimalFormat;

public class MultipleChoiceQuiz extends javax.swing.JFrame {
    //Publicly Declared Variables
    int question = 0;
    int correct = 0;
    int incorrect = 0;
    int randomNumber,randomNumber1,randomNumber2 ;
    double percentage;
    
    //Strings
    String answer;
    
    //Creating a decimal format
    DecimalFormat percent = new DecimalFormat("###");
    
        
    public MultipleChoiceQuiz() {
        initComponents();
        
        //Setting questions to invisible
        questionNumLbl.setVisible(false);
        questionLbl.setVisible(false);
        answerALbl.setVisible(false);
        answerBLbl.setVisible(false);
        answerCLbl.setVisible(false);
        answerDLbl.setVisible(false);
        answerLbl.setVisible(false);
        submitBtn.setVisible(false);
        answerTxtField.setVisible(false);
        incorrectLbl.setVisible(false);
        correctLbl.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        instructionsLbl = new javax.swing.JLabel();
        instructionTwoLbl = new javax.swing.JLabel();
        instructionThreeLbl = new javax.swing.JLabel();
        instructionOneLbl = new javax.swing.JLabel();
        instructionFourLbl = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        questionNumLbl = new javax.swing.JLabel();
        answerALbl = new javax.swing.JLabel();
        answerCLbl = new javax.swing.JLabel();
        answerDLbl = new javax.swing.JLabel();
        answerBLbl = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        answerLbl = new javax.swing.JLabel();
        answerTxtField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        incorrectLbl = new javax.swing.JLabel();
        correctLbl = new javax.swing.JLabel();
        messageLbl = new javax.swing.JLabel();
        percentageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPnl.setBackground(new java.awt.Color(255, 153, 255));
        backgroundPnl.setForeground(new java.awt.Color(255, 51, 255));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        titleLbl.setText("Peter's Multiple Choice Quiz");
        backgroundPnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        instructionsLbl.setText("Instructions: ");
        backgroundPnl.add(instructionsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        instructionTwoLbl.setText("2) Type The Letter Of The Correct Answer Into The Box");
        backgroundPnl.add(instructionTwoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        instructionThreeLbl.setText("3) Press Submit");
        backgroundPnl.add(instructionThreeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        instructionOneLbl.setBackground(new java.awt.Color(255, 153, 255));
        instructionOneLbl.setText("1) Read Question");
        instructionOneLbl.setOpaque(true);
        backgroundPnl.add(instructionOneLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        instructionFourLbl.setText("4) Press Next");
        backgroundPnl.add(instructionFourLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        questionNumLbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        questionNumLbl.setText("Question #1");
        backgroundPnl.add(questionNumLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 20));

        answerALbl.setText("A)");
        backgroundPnl.add(answerALbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 320, 20));

        answerCLbl.setText("C)");
        backgroundPnl.add(answerCLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, 20));

        answerDLbl.setText("D)");
        backgroundPnl.add(answerDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 320, 20));

        answerBLbl.setText("B)");
        backgroundPnl.add(answerBLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 20));

        questionLbl.setFont(new java.awt.Font("Ti73pc", 0, 14)); // NOI18N
        questionLbl.setText("How Many Bits Are In A Byte?");
        backgroundPnl.add(questionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        answerLbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        answerLbl.setText("Answer:");
        backgroundPnl.add(answerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));
        backgroundPnl.add(answerTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, -1));

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        incorrectLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        incorrectLbl.setText("Incorrect Answers: 0");
        backgroundPnl.add(incorrectLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        correctLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correctLbl.setText("Correct Answers: 0");
        backgroundPnl.add(correctLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        messageLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messageLbl.setForeground(new java.awt.Color(255, 0, 0));
        backgroundPnl.add(messageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, 20));

        percentageLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        percentageLbl.setForeground(new java.awt.Color(102, 255, 255));
        backgroundPnl.add(percentageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        //Setting Instructions to not visible 
        instructionsLbl.setVisible(false);
        instructionOneLbl.setVisible(false);
        instructionTwoLbl.setVisible(false);
        instructionThreeLbl.setVisible(false);
        instructionFourLbl.setVisible(false);
        //Setting Questions To Visible 
        questionNumLbl.setVisible(true);
        questionLbl.setVisible(true);
        answerALbl.setVisible(true);
        answerBLbl.setVisible(true);
        answerCLbl.setVisible(true);
        answerDLbl.setVisible(true);
        answerLbl.setVisible(true);
        submitBtn.setVisible(true);
        answerTxtField.setVisible(true);
        incorrectLbl.setVisible(true);
        correctLbl.setVisible(true);
        
        //Reenabling the submit button
        submitBtn.setEnabled(true);
        
        //Making it the first question
        question = question + 1;
        
        //Creating Question One
        if (question == 1){
            //random Numbers
            randomNumber = (int)Math.round(Math.random()*16+1);
            randomNumber1 = (int)Math.round(Math.random()*31+1);
            randomNumber2 = (int)Math.round(Math.random()*3+1);
            answerALbl.setText("A) 8");
            answerBLbl.setText("B) " + randomNumber);
            answerCLbl.setText("C) " + randomNumber1);
            answerDLbl.setText("D) " + randomNumber2);
        }
        else if (question == 2){
            questionNumLbl.setText("Question #2");
            questionLbl.setText("How Many Pins Are In The Main Mother Board Power Connector?");
            //random Numbers
            randomNumber = (int)Math.round(Math.random()*13+1);
            randomNumber1 = (int)Math.round(Math.random()*11+1);
            randomNumber2 = (int)Math.round(Math.random()*7+1);
            answerALbl.setText("A) " + randomNumber1);
            answerBLbl.setText("B) 24");
            answerCLbl.setText("C) " + randomNumber2);
            answerDLbl.setText("D) " + randomNumber);
        }
        else if (question == 3){
            questionNumLbl.setText("Question #3");
            questionLbl.setText("What Item On The Mother Board Keeps Time When Computer Is Off");
            answerALbl.setText("A) Clock");
            answerBLbl.setText("B) RAM");
            answerCLbl.setText("C) SATA");
            answerDLbl.setText("D) CMOS");
        }
        else if (question == 4){
            questionNumLbl.setText("Question #4");
            questionLbl.setText("What Is The Most Popular Coding Language");
            answerALbl.setText("A) Python");
            answerBLbl.setText("B) Java");
            answerCLbl.setText("C) SATA");
            answerDLbl.setText("D) Arduino");
        }
        else if (question == 5){
            questionNumLbl.setText("Question #5");
            questionLbl.setText("Why Is Machine Code In Binary");
            answerALbl.setText("A) Transistor");
            answerBLbl.setText("B) Resistor");
            answerCLbl.setText("C) Potentiometer");
            answerDLbl.setText("D) Radio Button");
        }
        else {
        //Turning off labels    
        questionNumLbl.setVisible(false);
        questionLbl.setVisible(false);
        answerALbl.setVisible(false);
        answerBLbl.setVisible(false);
        answerCLbl.setVisible(false);
        answerDLbl.setVisible(false);
        answerLbl.setVisible(false);
        submitBtn.setVisible(false);
        answerTxtField.setVisible(false);
        //Getting the final percentage of the answers
        percentage = ((double)correct/5)*100;
        percentageLbl.setText("You got " + percent.format(percentage) + "%");
        
        }
        //disabling the next button until question is answerd
        if (question == 6){
            nextBtn.setEnabled(true);
        }
        else{
            nextBtn.setEnabled(false);
        }
        
    }//GEN-LAST:event_nextBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //getting user input
        answer = answerTxtField.getText();

       
        
        
        //Seeing if it is correct depending on question 
        if (answer.equalsIgnoreCase("a") && question == 1){
            correct = correct + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("b") && question == 2){
            correct = correct + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("d") && question == 3){
            correct = correct + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("b") && question == 4){
            correct = correct + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("a") && question == 5){
            correct = correct + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d") && question == 1 ){
            incorrect = incorrect + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d") && question == 2 ){
            incorrect = incorrect + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("b") && question == 3 ){
            incorrect = incorrect + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d") && question == 4 ){
            incorrect = incorrect + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d") && question == 5 ){
            incorrect = incorrect + 1;
            submitBtn.setEnabled(false);//Disableing the button
            answerTxtField.setText("");
            nextBtn.setEnabled(true);
            messageLbl.setVisible(false);
        }
        else {
            messageLbl.setVisible(true);
            messageLbl.setText("Enter A,B,C,D");
        }
        
        //Setting the incorrect and correct lable 
        correctLbl.setText("Correct Answers: " + correct);
        incorrectLbl.setText("Incorrect Answers: " + incorrect);
    }//GEN-LAST:event_submitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleChoiceQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerALbl;
    private javax.swing.JLabel answerBLbl;
    private javax.swing.JLabel answerCLbl;
    private javax.swing.JLabel answerDLbl;
    private javax.swing.JLabel answerLbl;
    private javax.swing.JTextField answerTxtField;
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JLabel correctLbl;
    private javax.swing.JLabel incorrectLbl;
    private javax.swing.JLabel instructionFourLbl;
    private javax.swing.JLabel instructionOneLbl;
    private javax.swing.JLabel instructionThreeLbl;
    private javax.swing.JLabel instructionTwoLbl;
    private javax.swing.JLabel instructionsLbl;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel percentageLbl;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JLabel questionNumLbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
