package practica_diu_3_matrix_visualizer;

import java.util.concurrent.ThreadLocalRandom;

public class MatrixDisplay extends javax.swing.JFrame {
    private int max;
    private int min;
    private int sliderRangeValue;
    private int [] [] currentMatrix;
    private static int MATRIX_SIZE = 10;
    public MatrixDisplay() {
        initComponents();
        inizializeVisualizer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel3 = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        configPanel = new javax.swing.JPanel();
        maxL = new javax.swing.JLabel();
        maxTF = new javax.swing.JTextField();
        minL = new javax.swing.JLabel();
        minTF = new javax.swing.JTextField();
        errorMinLabel = new javax.swing.JLabel();
        errorMaxLabel = new javax.swing.JLabel();
        matrixShowPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrixTA = new javax.swing.JTextArea();
        rangeSlider = new javax.swing.JSlider();
        namePanel = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InfoPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        infoSliderValue = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        infoMaxValue = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitlePanel.setBackground(new java.awt.Color(250, 252, 211));
        TitlePanel.setLayout(new java.awt.GridBagLayout());

        title.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        title.setText("Matrix Visualizer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        TitlePanel.add(title, gridBagConstraints);

        configPanel.setBackground(new java.awt.Color(247, 248, 226));
        configPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));
        configPanel.setForeground(new java.awt.Color(255, 255, 255));
        configPanel.setToolTipText("Configuration");
        configPanel.setLayout(new java.awt.GridBagLayout());

        maxL.setText("Max Value:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        configPanel.add(maxL, gridBagConstraints);

        maxTF.setToolTipText("max Value");
        maxTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maxTFKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        configPanel.add(maxTF, gridBagConstraints);

        minL.setText("Min Value:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        configPanel.add(minL, gridBagConstraints);

        minTF.setToolTipText("min Value");
        minTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minTFKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        configPanel.add(minTF, gridBagConstraints);

        errorMinLabel.setBackground(new java.awt.Color(255, 51, 51));
        errorMinLabel.setForeground(new java.awt.Color(255, 51, 51));
        configPanel.add(errorMinLabel, new java.awt.GridBagConstraints());

        errorMaxLabel.setForeground(new java.awt.Color(255, 51, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        configPanel.add(errorMaxLabel, gridBagConstraints);

        matrixShowPanel.setBackground(new java.awt.Color(248, 247, 221));
        matrixShowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Matrix "));
        matrixShowPanel.setToolTipText("MatrixShowPanel");

        matrixTA.setEditable(false);
        matrixTA.setColumns(20);
        matrixTA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matrixTA.setRows(5);
        matrixTA.setToolTipText("matrix image");
        matrixTA.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setViewportView(matrixTA);

        rangeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rangeSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout matrixShowPanelLayout = new javax.swing.GroupLayout(matrixShowPanel);
        matrixShowPanel.setLayout(matrixShowPanelLayout);
        matrixShowPanelLayout.setHorizontalGroup(
            matrixShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matrixShowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(rangeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        matrixShowPanelLayout.setVerticalGroup(
            matrixShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matrixShowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        namePanel.setBackground(new java.awt.Color(250, 252, 227));
        namePanel.setLayout(new java.awt.GridBagLayout());

        nombre.setText("Abiam Remache González");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        namePanel.add(nombre, gridBagConstraints);

        jLabel1.setText("Alejandro Lezcano ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        namePanel.add(jLabel1, gridBagConstraints);

        jLabel2.setText("de Mújica Montesdeoca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        namePanel.add(jLabel2, gridBagConstraints);

        InfoPanel.setBackground(new java.awt.Color(250, 251, 224));
        InfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        InfoPanel.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("The matrix numbers are bigger than:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        InfoPanel.add(jLabel4, gridBagConstraints);

        infoSliderValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        infoSliderValue.setText("sliderValue");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        InfoPanel.add(infoSliderValue, gridBagConstraints);

        jLabel6.setText("The matrix numbers are lower than:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        InfoPanel.add(jLabel6, gridBagConstraints);

        infoMaxValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        infoMaxValue.setText("maxValue");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        InfoPanel.add(infoMaxValue, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matrixShowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(configPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matrixShowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(configPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rangeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rangeSliderStateChanged
        // TODO add your handling code here:
        sliderRangeValue = rangeSlider.getValue();
        updateMatrix();
        updateInfo();
    }//GEN-LAST:event_rangeSliderStateChanged

    private void maxTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxTFKeyReleased
        // TODO add your handling code here:
        if(checkNewMax(maxTF.getText())){
            updateSlider();
            generateNewMatrix();
            updateInfo();
        }
    }//GEN-LAST:event_maxTFKeyReleased

    private void minTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTFKeyReleased
        // TODO add your handling code here:
        if(checkNewMin(minTF.getText())){
            updateSlider();
            generateNewMatrix();
            updateInfo();
        }
    }//GEN-LAST:event_minTFKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel configPanel;
    private javax.swing.JLabel errorMaxLabel;
    private javax.swing.JLabel errorMinLabel;
    private javax.swing.JLabel infoMaxValue;
    private javax.swing.JLabel infoSliderValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel matrixShowPanel;
    private javax.swing.JTextArea matrixTA;
    private javax.swing.JLabel maxL;
    private javax.swing.JTextField maxTF;
    private javax.swing.JLabel minL;
    private javax.swing.JTextField minTF;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel nombre;
    private javax.swing.JSlider rangeSlider;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void inizializeVisualizer() {
        //Variables
        max = 0; min = 0; sliderRangeValue = 0; currentMatrix = new int [10][10];
        
        ////TextField and Labels
        minTF.setText("0");maxTF.setText("0");infoSliderValue.setText("0");infoMaxValue.setText("0");
        
        ////Slider
        updateSlider();
        rangeSlider.setPaintLabels(true);
        rangeSlider.setPaintTicks(true);
        
        ////TextArea (Matrix)
        generateNewMatrix();
    }
    
    private void generateNewMatrix(){
        String res ="| ";
        int maxlen = Integer.toString(max).length();
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                int num = generateRandomNumber();
                currentMatrix[i][j] = num;
                int len = Integer.toString(num).length();
                int neededSpaces = maxlen - len + 2;
                res += String.format("%-"+neededSpaces+"s", Integer.toString(num)) + "| ";
            }
            if(i != MATRIX_SIZE-1) res+="\n| ";
        }
        matrixTA.setText(res);
    }
    private int generateRandomNumber(){
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        return tlr.nextInt(min, max + 1);
    }
    
    private void updateSlider(){
        rangeSlider.setMinimum(min);
        int a = max;
        rangeSlider.setMaximum(max);
        int range = max-min;
        int len = Integer.toString(range).length();
        int inter = range/2;
        rangeSlider.setMajorTickSpacing(inter);
        rangeSlider.repaint();
        //rangeSlider.setMinorTickSpacing((max/10)/5);
        rangeSlider.validate();
    }
    public boolean checkNewMin(String newInput){
        if(isNumeric(newInput)){
            int newMin = Integer.parseInt(newInput);
            if(isAValidRange(newMin,max)){
                min = newMin;
                sliderRangeValue = rangeSlider.getValue();
                errorMinLabel.setText("");
                errorMaxLabel.setText("");
                return true;
            }else{
                errorMinLabel.setText("Range not Valid");
                minTF.setText(min+"");
            }
        }else{
            errorMinLabel.setText("Not a Number");
            minTF.setText(min+"");
        }
        return false;
    }
    
    public boolean checkNewMax(String newInput){
        if(isNumeric(newInput)){
            int newMax = Integer.parseInt(newInput);
            if(isAValidRange(min,newMax)){
                max = newMax;
                sliderRangeValue = rangeSlider.getValue();
                errorMinLabel.setText("");
                errorMaxLabel.setText("");
                return true;
            }else{
                errorMaxLabel.setText("Range not Valid");
                maxTF.setText(max+"");
            }
        }else{
            errorMaxLabel.setText("Not a Number");
            maxTF.setText(max+"");
        }
        return false;
    }
    
    public boolean isAValidRange(int minValue, int maxValue){
        if(minValue>maxValue)return false;
        return true;
    }
    public boolean isNumeric(String num){
        for (int i = 0; i < num.length(); i++) {
            if(!Character.isDigit(num.charAt(i)))return false;            
        }
        return true;
    }
    
    public void updateInfo(){
        infoMaxValue.setText(max+"");
        infoSliderValue.setText(sliderRangeValue+"");
    }

    private void updateMatrix() {
        String res ="| ";
        int maxlen = Integer.toString(max).length();
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                int num = currentMatrix[i][j];
                int len = Integer.toString(num).length();
                int neededSpaces = maxlen - len + 2;
                if(num <= sliderRangeValue){
                    res += "- | ";
                }else{
                    res += String.format("%-"+neededSpaces+"s", Integer.toString(num)) + "| ";
                }
                
            }
            if(i != MATRIX_SIZE-1) res+="\n| ";
        }
        matrixTA.setText(res);
    }
}
