int num = Integer.parseInt(txtNum.getValue().toString());

int r = num % 2;
lblResto.setText(Integer.toString(r));

double c = Math.pow(num,3);
lblCubo.setText (Double.toString(c));

double rq = Math.sqrt(num);
lblRaizQ.setText(String.format("%.2f",rq));

double rc = Math.cbrt(num);
lblRaizC.setText(String.format("%.2f",rc));

int abs = Math.abs(num);
lblAbs.setText(Integer.toString(abs));
