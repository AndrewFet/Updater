package local.fetandre.lib;

public class Updater {

    String libPass = "Mallesh";


    public Updater(String libPass) {
        this.libPass = libPass;
    }

    public String myVal(String pass) {
        if (pass.equals(libPass)) {
            return "\n" +
                    "class MyValueConverter : IValueConverter\n" +
                    "    {\n" +
                    "        public object Convert(object value, Type targetType, object parameter, CultureInfo culture)\n" +
                    "        {\n" +
                    "            if ((bool)value) return new SolidColorBrush(Color.FromRgb(25, 106, 166));\n" +
                    "            else\n" +
                    "                return new SolidColorBrush(Color.FromRgb(250, 200, 38));\n" +
                    "        }\n" +
                    "\n" +
                    "        public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)\n" +
                    "        {\n" +
                    "            throw new NotImplementedException();\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "XML\n" +
                    " <local:MyValueConverter x:Key=\"colorConverter\"/>\n" +
                    "<Style TargetType=\"DataGridRow\">\n" +
                    "                <Setter Property=\"Background\" Value=\"{Binding isSuccess, Converter={StaticResource colorConverter}}\"/>\n" +
                    "                <Setter Property=\"FontSize\" Value=\"15\"/>\n" +
                    "                <!--<Setter Property=\"Background\" Value=\"#196AA6\"/>-->\n" +
                    "                <Setter Property=\"Foreground\" Value=\"#F79420\"/>\n" +
                    "                <Setter Property=\"FontFamily\" Value=\"./#TeXGyreAdventor-Regular.ttf\"/>\n" +
                    "            </Style>";
        }

        return "Error501";
    }


    public String graph(String pass) {
        if (pass.equals(libPass)) {
            return "XML\n" +
                    "<WindowsFormsHost><dvc:Chart x:Name=\"chart\" /></WindowsFormsHost>\n" +
                    "\n" +
                    "<Window xmlns=\"http://schemas.microsoft.com/winfx/2006/xaml/presentation\"\n" +
                    "...\n" +
                    "xmlns:dvc=\"clr-namespace:System.Windows.Forms.DataVisualization.Charting; assembly=System.Windows.Forms.DataVisualization\">\n" +
                    "<StackPanel>\n" +
                    "<WindowsFormsHost><dvc:Chart x:Name=\"chart\" /></WindowsFormsHost>\n" +
                    "</StackPanel>\n" +
                    "</Window>\n" +
                    "\n" +
                    "C#\n" +
                    "WindowsFormsHost><dvc:Chart x:Name=\"chart\" /></WindowsFormsHost>\n" +
                    "using System.Windows.Forms.DataVisualization.Charting\n" +
                    "chart.ChartAreas.Add(new ChartArea(\"Default\"));\n" +
                    "\n" +
                    "chart.Series.Add(new Series(\"Series1\"));\n" +
                    "chart.Series[\"Series1\"].ChartArea = \"Default\";\n" +
                    "chart.Series[\"Series1\"].ChartType = SeriesChartType.Line;\n" +
                    "\n" +
                    "string[] axisXData = new string[] {\"a\", \"b\", \"c\"};\n" +
                    "double[] axisYData = new double[] {0.1, 1.5, 1.9};\n" +
                    "chart.Series[\"Series1\"].Points.DataBindXY(axisXData, axisYData);";
        }
        return "Error";
    }

    public String meths(String pass) {
        if (pass.equals(libPass)) {
            return "private static int LevensteinDistance(string word1, int length1, string word2, int length2)\n" +
                    "        {\n" +
                    "            if (length1 == 0)\n" +
                    "            {\n" +
                    "                return length2;\n" +
                    "            }\n" +
                    "            if (length2 == 0)\n" +
                    "            {\n" +
                    "                return length1;\n" +
                    "            }\n" +
                    "            var subcost = 1;\n" +
                    "            if (word1[length1-1]==word2[length2-1])\n" +
                    "            {\n" +
                    "                subcost = 0;\n" +
                    "            }\n" +
                    "            var substitution = LevensteinDistance(word1, length1-1, word2, length2-1) +subcost;\n" +
                    "            var deletion = LevensteinDistance(word1, length1 - 1, word2, length2) + 1;\n" +
                    "            var insertion = LevensteinDistance(word1, length1, word2, length2 - 1) + 1;\n" +
                    "            return Math.Min(substitution, Math.Min(deletion, insertion));\n" +
                    "\n" +
                    "        }\n" +
                    "        public static int LevensteinDistance(string word1, string word2) => LevensteinDistance(word1, word1.Length, word2, word2.Length);\n" +
                    "\n" +
                    "        public string Md5Converter(string password)\n" +
                    "        {\n" +
                    "            byte[] bytes = Encoding.Unicode.GetBytes(password);\n" +
                    "            string hash = \"\";\n" +
                    "            MD5CryptoServiceProvider provider = new MD5CryptoServiceProvider();\n" +
                    "            bytes = provider.ComputeHash(bytes);\n" +
                    "            foreach (var item in bytes)\n" +
                    "            {\n" +
                    "                hash += string.Format(\"{0:x2}\", item);\n" +
                    "            }\n" +
                    "            return hash;\n" +
                    "        }\n" +
                    "        public static byte[] ImageConverter(BitmapImage bitmapImage)\n" +
                    "        {\n" +
                    "            if (bitmapImage == null) return null;\n" +
                    "            MemoryStream stream = new MemoryStream();\n" +
                    "            JpegBitmapEncoder encoder = new JpegBitmapEncoder();\n" +
                    "            encoder.Frames.Add(BitmapFrame.Create(bitmapImage));\n" +
                    "            encoder.Save(stream);\n" +
                    "            return stream.ToArray();\n" +
                    "        }\n" +
                    "        public static BitmapImage ImageConverter(byte[] buffer)\n" +
                    "        {\n" +
                    "            if (buffer == null) return null;\n" +
                    "            MemoryStream stream = new MemoryStream();\n" +
                    "            stream.Write(buffer, 0, buffer.Length);\n" +
                    "            stream.Position = 0;\n" +
                    "            BitmapImage image = new BitmapImage();\n" +
                    "            image.BeginInit();\n" +
                    "            image.StreamSource = stream;\n" +
                    "            image.EndInit();\n" +
                    "            return image;\n" +
                    "        }\n" +
                    "        public static void ShowWindow(object w, object sender)\n" +
                    "        {\n" +
                    "            //w - куда перейти; sender - откуда\n" +
                    "            ((Window)w).Left = ((Window)sender).Left;\n" +
                    "            ((Window)w).Top = ((Window)sender).Top;\n" +
                    "            ((Window)w).Show();\n" +
                    "            ((Window)sender).Close();\n" +
                    "        }";
        }
        return "0";
    }

    public String capture(String pass) {
        if (pass.equals(libPass)) {
            return "XML\n" +
                    "<StackPanel Grid.Row=\"1\">\n" +
                    "            <StackPanel Orientation=\"Horizontal\">\n" +
                    "                <StackPanel>\n" +
                    "                    <TextBlock x:Name=\"tbCaptcha1\" Width=\"50\" FontSize=\"25\" Text=\"1\" Style=\"{StaticResource tbDefault}\"/>\n" +
                    "                </StackPanel>\n" +
                    "                <StackPanel>\n" +
                    "                    <TextBlock x:Name=\"tbCaptcha2\" Width=\"50\" FontSize=\"25\" Text=\"2\" Style=\"{StaticResource tbDefault}\"/>\n" +
                    "                </StackPanel>\n" +
                    "                <StackPanel>\n" +
                    "                    <TextBlock x:Name=\"tbCaptcha3\" Width=\"50\" FontSize=\"25\" Text=\"3\" Style=\"{StaticResource tbDefault}\"/>\n" +
                    "                </StackPanel>\n" +
                    "                <StackPanel>\n" +
                    "                    <TextBlock x:Name=\"tbCaptcha4\" Width=\"50\" FontSize=\"25\" Text=\"4\" Style=\"{StaticResource tbDefault}\"/>\n" +
                    "                </StackPanel>\n" +
                    "            </StackPanel>\n" +
                    "            <TextBox Margin=\"5\" x:Name=\"tbxCapcha\" Width=\"300\"/>\n" +
                    "            <Button Margin=\"5\" Content=\"ReCapcha\" x:Name=\"btnCapcha\" Click=\"btnCapcha_Click\"/>\n" +
                    "        </StackPanel>\n" +
                    "\n" +
                    "C#\n" +
                    "\n" +
                    " Random r;\n" +
                    "        string letters= \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\";\n" +
                    "        string capch=\"\";\n" +
                    "\n" +
                    " public void Recapctha()\n" +
                    "        {\n" +
                    "            tbCaptcha1.Text = letters[r.Next(0,letters.Length-1)].ToString();\n" +
                    "            tbCaptcha1.RenderTransform = new RotateTransform (r.Next(-90, 90));\n" +
                    "            tbCaptcha2.Text = letters[r.Next(0, letters.Length - 1)].ToString();\n" +
                    "            tbCaptcha2.RenderTransform = new RotateTransform(r.Next(-90, 90));\n" +
                    "            tbCaptcha3.Text = letters[r.Next(0, letters.Length - 1)].ToString();\n" +
                    "            tbCaptcha3.RenderTransform = new RotateTransform(r.Next(-90, 90));\n" +
                    "            tbCaptcha4.Text = letters[r.Next(0, letters.Length - 1)].ToString();\n" +
                    "            tbCaptcha4.RenderTransform = new RotateTransform(r.Next(-90, 90));\n" +
                    "            tbxCapcha.Text = \"\";\n" +
                    "            capch = tbCaptcha1.Text + tbCaptcha2.Text + tbCaptcha3.Text + tbCaptcha4.Text;\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "\n" +
                    "private void btnLogin_Click(object sender, RoutedEventArgs e)\n" +
                    "        {\n" +
                    "            if (tbxCapcha.Text!=capch)\n" +
                    "            {\n" +
                    "                MessageBox.Show(\"Неправильный ввод капчи!\");\n" +
                    "                Recapctha();\n" +
                    "                return;\n" +
                    "            }\n" +
                    "            if (db.Table.FirstOrDefault(a=>a.Email==tbxEmail.Text && a.Password==pasBox.Password)!=null)\n" +
                    "            {\n" +
                    "                if (cbxRememberMe.IsChecked==true)\n" +
                    "                {\n" +
                    "                    File.WriteAllText(\"Password\",tbxEmail.Text+\"\\n\"+pasBox.Password);\n" +
                    "                }\n" +
                    "                MessageBox.Show(\"Вы удачно авторизовались!\");\n" +
                    "                UserScreen w = new UserScreen();\n" +
                    "                w.Show();\n" +
                    "                this.Close();\n" +
                    "            }\n" +
                    "            else\n" +
                    "            {\n" +
                    "                MessageBox.Show(\"неверная связка логин/пароль!\");\n" +
                    "                Recapctha();\n" +
                    "            }\n" +
                    "        }";
        }
        return "0";
    }

    public String dataGrinder(String pass) {
        if (pass.equals(libPass)) {
            return "i<DataGrid x:Name=\"DG\" Grid.Row=\"2\">\n" +
                    "            <DataGrid.Columns>\n" +
                    "                <DataGridTemplateColumn>\n" +
                    "                    <DataGridTemplateColumn.CellTemplate>\n" +
                    "                        <DataTemplate>\n" +
                    "                            <Button x:Name=\"btnTest\" Click=\"btnTest_Click\" Visibility=\"Collapsed\"/>\n" +
                    "                        </DataTemplate>\n" +
                    "                    </DataGridTemplateColumn.CellTemplate>\n" +
                    "                </DataGridTemplateColumn>\n" +
                    "                <DataGridTextColumn Header=\"First name\" Binding=\"{Binding Path=firstName}\"/> \n" +
                    " </DataGrid.Columns>\n" +
                    "        </DataGrid>";
        }
        return "0";
    }


    public String add(String pass) {
        if (pass.equals(libPass)) {
            return "XML\n" +
                    "<Grid.RowDefinitions>\n" +
                    "            <RowDefinition/>\n" +
                    "            <RowDefinition Height=\"0.2*\"/>\n" +
                    "        </Grid.RowDefinitions>\n" +
                    "        <StackPanel HorizontalAlignment=\"Center\">\n" +
                    "            <StackPanel Orientation=\"Horizontal\">\n" +
                    "                <TextBlock Text=\"Email address\" Style=\"{StaticResource tbDefault}\" Margin=\"0 15\"/>\n" +
                    "                <TextBox x:Name=\"tbemail\" Width=\"350\"/>\n" +
                    "            </StackPanel>\n" +
                    "<StackPanel Orientation=\"Horizontal\">\n" +
                    "                <TextBlock Text=\"Office\" Style=\"{StaticResource tbDefault}\" Margin=\"0 15\"/>\n" +
                    "                <ComboBox x:Name=\"cbxOffices\" Width=\"350\" VerticalAlignment=\"Center\"/>\n" +
                    "            </StackPanel>\n" +
                    "            <StackPanel Orientation=\"Horizontal\">\n" +
                    "                <TextBlock Text=\"Birthdate\" Style=\"{StaticResource tbDefault}\" Margin=\"0 15\"/>\n" +
                    "                <DatePicker x:Name=\"dpBirthdate\" Width=\"350\"/>\n" +
                    "            </StackPanel>\n" +
                    "</StackPanel>\n" +
                    "<StackPanel Grid.Row=\"1\" Orientation=\"Horizontal\" VerticalAlignment=\"Center\" HorizontalAlignment=\"Center\">\n" +
                    "            <Button Content=\"Save\" x:Name=\"btnSave\" Click=\"btnSave_Click\"/>\n" +
                    "            <Button Content=\"Cancel\" Background=\"#f79420\" x:Name=\"btnCancel\" Click=\"btnCancel_Click\"/>\n" +
                    "        </StackPanel>\n" +
                    "\n" +
                    "C#\n" +
                    "InitializeComponent();\n" +
                    "            try\n" +
                    "            {\n" +
                    "                db = new ModelDB();\n" +
                    "                cbxOffices.ItemsSource = db.Offices.ToList().Select(a => a.Title).ToList();\n" +
                    "            }\n" +
                    "            catch (Exception ex)\n" +
                    "            {\n" +
                    "                UnexpectedExit w = new UnexpectedExit();\n" +
                    "                w.ShowDialog();\n" +
                    "                if (string.IsNullOrWhiteSpace(w.tbDesc.Text))\n" +
                    "                {\n" +
                    "                    Properties.Settings.Default.udesc = w.tbDesc.Text;\n" +
                    "                }\n" +
                    "                //  MessageBox.Show(\"Good bye!\");\n" +
                    "                Properties.Settings.Default.exception = ex.ToString();\n" +
                    "                this.Close();\n" +
                    "\n" +
                    "\n" +
                    "            }\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        private void btnSave_Click(object sender, RoutedEventArgs e)\n" +
                    "        {\n" +
                    "            try\n" +
                    "            {\n" +
                    "                DateTime date;\n" +
                    "                if (string.IsNullOrWhiteSpace(tbemail.Text) || string.IsNullOrWhiteSpace(dpBirthdate.Text) || !DateTime.TryParse(dpBirthdate.Text, out date) || string.IsNullOrWhiteSpace(tbPassword.Text) || string.IsNullOrWhiteSpace(tbLastName.Text) || string.IsNullOrWhiteSpace(tbFirstName.Text))\n" +
                    "                {\n" +
                    "                    MessageBox.Show(\"Нужно заполнить все поля!\");\n" +
                    "                }\n" +
                    "                else\n" +
                    "                {\n" +
                    "                    User u = new User();\n" +
                    "                    u.ID = db.Users.ToList().Count()+1;\n" +
                    "                    u.Active = true;\n" +
                    "                    u.Birthdate = dpBirthdate.DisplayDate;\n" +
                    "                    u.Email = tbemail.Text;\n" +
                    "                    u.Password = MD5Converter.Do(tbPassword.Text);\n" +
                    "                    u.OfficeID = db.Offices.ToList().FirstOrDefault(a=>a.Title==cbxOffices.Text).ID;\n" +
                    "                    u.FirstName = tbFirstName.Text;\n" +
                    "                    u.LastName = tbLastName.Text;\n" +
                    "                    u.RoleID = 2;\n" +
                    "                    db.Users.Add(u);\n" +
                    "                    db.SaveChanges();\n" +
                    "                    DialogResult = true;\n" +
                    "                }\n" +
                    "            }\n" +
                    "            catch (Exception ex)\n" +
                    "            {\n" +
                    "                UnexpectedExit w = new UnexpectedExit();\n" +
                    "                w.ShowDialog();\n" +
                    "                if (!string.IsNullOrEmpty(w.tbDesc.Text))\n" +
                    "                {\n" +
                    "                    Properties.Settings.Default.udesc = w.tbDesc.Text;\n" +
                    "                }\n" +
                    "                //  MessageBox.Show(\"Good bye!\");\n" +
                    "                Properties.Settings.Default.exception = ex.ToString();\n" +
                    "                DialogResult = false;\n" +
                    "                this.Close();\n" +
                    "\n" +
                    "\n" +
                    "            }\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        private void btnCancel_Click(object sender, RoutedEventArgs e)\n" +
                    "        {\n" +
                    "            DialogResult = false;\n" +
                    "            return;\n" +
                    "        }";
        }
        return "0";
    }

    public String jsonParsing(String pass){
        if (pass.equals(libPass)){
            return " public class JSONTask extends AsyncTask<String, String, String>\n" +
                    "    {\n" +
                    "        @Override\n" +
                    "        protected void onPostExecute(String s) {\n" +
                    "            super.onPostExecute(s);\n" +
                    "            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();\n" +
                    "        }\n" +
                    "\n" +
                    "        @Override\n" +
                    "        protected String doInBackground(String... strings) {\n" +
                    "\n" +
                    "\n" +
                    "            try {\n" +
                    "                URL url= new URL(\"https://api.myjson.com/bins/b4pdd\");\n" +
                    "                HttpURLConnection connection = (HttpURLConnection)url.openConnection();\n" +
                    "                InputStream is = connection.getInputStream();\n" +
                    "                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));\n" +
                    "                StringBuffer stringBuffer = new StringBuffer();\n" +
                    "                StringBuffer lastBuffer = new StringBuffer();\n" +
                    "                String line = \"\";\n" +
                    "                while ((line=bufferedReader.readLine())!=null)\n" +
                    "                {\n" +
                    "                    stringBuffer.append(line);\n" +
                    "                }\n" +
                    "                String text = stringBuffer.toString();\n" +
                    "                JSONObject jsonObject = new JSONObject(text);\n" +
                    "                JSONArray jsonArray = jsonObject.getJSONArray(\"studentinfo\");\n" +
                    "                Cursor cursor = db.rawQuery(\"SELECT * FROM users\", null);\n" +
                    "                if (cursor.getCount() == 0)\n" +
                    "                {\n" +
                    "                    for (int i = 0; i < jsonArray.length(); i++) {\n" +
                    "                        ContentValues cv = new ContentValues();\n" +
                    "                        JSONObject obj = jsonArray.getJSONObject(i);\n" +
                    "                        cv.put(\"name\", obj.getString(\"name\"));\n" +
                    "                        cv.put(\"age\", obj.getString(\"age\"));\n" +
                    "                        cv.put(\"description\", obj.getString(\"description\"));\n" +
                    "                        db.insert(\"users\", null, cv);\n" +
                    "                        lastBuffer.append(obj.getString(\"name\") + \" \" + obj.getString(\"age\")+ \" \" +obj.getString(\"description\") +\"\\n\");\n" +
                    "                    }\n" +
                    "                }\n" +
                    "                else\n" +
                    "                {\n" +
                    "                    boolean flag = false;\n" +
                    "                    for (int i = 0; i < jsonArray.length(); i++) {\n" +
                    "                        cursor.moveToFirst();\n" +
                    "                        flag = false;\n" +
                    "                        ContentValues cv = new ContentValues();\n" +
                    "                        JSONObject obj = jsonArray.getJSONObject(i);\n" +
                    "                        do {\n" +
                    "                            if (obj.getString(\"name\") == cursor.getString(0)) {\n" +
                    "                            flag = true;\n" +
                    "                            }\n" +
                    "                        }while (cursor.moveToNext());\n" +
                    "                        if (flag == false) {\n" +
                    "                            cv.put(\"name\", obj.getString(\"name\"));\n" +
                    "                            cv.put(\"age\", obj.getString(\"age\"));\n" +
                    "                            cv.put(\"description\", obj.getString(\"description\"));\n" +
                    "                            db.insert(\"users\", null, cv);\n" +
                    "\n" +
                    "                        }\n" +
                    "                        lastBuffer.append(obj.getString(\"name\") + \" \" + obj.getString(\"age\")+ \" \" +obj.getString(\"description\") +\"\\n\");\n" +
                    "                    }\n" +
                    "                }\n" +
                    "\n" +
                    "                return lastBuffer.toString();\n" +
                    "\n" +
                    "            } catch (MalformedURLException e) {\n" +
                    "                e.printStackTrace();\n" +
                    "            } catch (IOException e) {\n" +
                    "                e.printStackTrace();\n" +
                    "            } catch (JSONException e) {\n" +
                    "                e.printStackTrace();\n" +
                    "            }\n" +
                    "\n" +
                    "\n" +
                    "            return null;\n" +
                    "        }\n" +
                    "    }";
        }
        return "Error";
    }


    public String editAndDelete(String pass){
        if (pass.equals(libPass)){
            return " lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {\n" +
                    "                Intent i = new Intent(getApplicationContext(), EditOrDeleteForm.class);\n" +
                    "                i.putExtra(\"name\", names.get(position));\n" +
                    "                i.putExtra(\"age\", ages.get(position));\n" +
                    "                i.putExtra(\"description\", descriptions.get(position));\n" +
                    "                startActivity(i);\n" +
                    "            }\n" +
                    "        });\n" +
                    "->\n" +
                    "XML\n" +
                    " <TextView\n" +
                    "        android:id=\"@+id/tvName1\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentStart=\"true\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_marginStart=\"73dp\"\n" +
                    "        android:layout_marginTop=\"8dp\"\n" +
                    "        android:text=\"Name:\"\n" +
                    "        android:textSize=\"30dp\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/tvAge1\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentStart=\"true\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_marginStart=\"99dp\"\n" +
                    "        android:layout_marginTop=\"62dp\"\n" +
                    "        android:text=\"Age:\"\n" +
                    "        android:textSize=\"30dp\" />\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:id=\"@+id/tvDescription1\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentStart=\"true\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_marginStart=\"0dp\"\n" +
                    "        android:layout_marginTop=\"121dp\"\n" +
                    "        android:text=\"Description:\"\n" +
                    "        android:textSize=\"30dp\" />\n" +
                    "\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/etNameEdit\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_alignParentEnd=\"true\"\n" +
                    "        android:layout_marginTop=\"5dp\"\n" +
                    "        android:layout_marginEnd=\"24dp\" />\n" +
                    "\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/etAgeEdit\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_alignParentEnd=\"true\"\n" +
                    "        android:layout_marginTop=\"59dp\"\n" +
                    "        android:layout_marginEnd=\"28dp\"\n" +
                    "        android:inputType=\"number\" />\n" +
                    "\n" +
                    "    <EditText\n" +
                    "        android:id=\"@+id/etDescriptionEdit\"\n" +
                    "        android:layout_width=\"200dp\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_alignParentEnd=\"true\"\n" +
                    "        android:layout_marginTop=\"119dp\"\n" +
                    "        android:layout_marginEnd=\"33dp\" />\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btnEditForm\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentStart=\"true\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_marginStart=\"43dp\"\n" +
                    "        android:layout_marginTop=\"247dp\"\n" +
                    "        android:onClick=\"btnAddEditForm_Click\"\n" +
                    "        android:text=\"Изменить\" />\n" +
                    "\n" +
                    "    <Button\n" +
                    "        android:id=\"@+id/btnDeleteForm\"\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:layout_alignParentStart=\"true\"\n" +
                    "        android:layout_alignParentTop=\"true\"\n" +
                    "        android:layout_marginStart=\"252dp\"\n" +
                    "        android:layout_marginTop=\"247dp\"\n" +
                    "        android:onClick=\"btnDeleteForm_Click\"\n" +
                    "        android:text=\"Удалить\" />\n" +
                    "->\n" +
                    " Intent i= getIntent();\n" +
                    "        db = getBaseContext().openOrCreateDatabase(\"mydb.db\", MODE_PRIVATE, null);\n" +
                    "        etName = findViewById(R.id.etNameEdit);\n" +
                    "        etAge = findViewById(R.id.etAgeEdit);\n" +
                    "        etDesc = findViewById(R.id.etDescriptionEdit);\n" +
                    "        etName.setText(i.getStringExtra(\"name\"));\n" +
                    "        etAge.setText(i.getStringExtra(\"age\"));\n" +
                    "        etDesc.setText(i.getStringExtra(\"description\"));\n" +
                    "->\n" +
                    " public void btnAddEditForm_Click(View view) {\n" +
                    "        Cursor cursor = db.rawQuery(\"SELECT * FROM users WHERE name='\"+getIntent().getExtras().getString(\"name\")+\"'\",null);\n" +
                    "        if (cursor.getCount() == 1) {\n" +
                    "            Cursor c = db.rawQuery(\"SELECT * FROM users WHERE name='\"+etName.getText().toString()+\"'\",null);\n" +
                    "            if (c.getCount() != 0) {\n" +
                    "                Toast.makeText(this, \"Такой уже есть!\", Toast.LENGTH_SHORT).show();\n" +
                    "                return;\n" +
                    "            }\n" +
                    "            ContentValues cv = new ContentValues();\n" +
                    "            cv.put(\"name\", etName.getText().toString());\n" +
                    "            cv.put(\"age\", etAge.getText().toString());\n" +
                    "            cv.put(\"description\", etDesc.getText().toString());\n" +
                    "            db.update(\"users\", cv, \"name='\"+getIntent().getExtras().getString(\"name\")+\"'\", null);\n" +
                    "            Intent i = new Intent(this, MainActivity.class);\n" +
                    "            startActivity(i);\n" +
                    "        }\n" +
                    "        else Toast.makeText(this, \"Такой уже есть(\", Toast.LENGTH_SHORT).show();\n" +
                    "\n" +
                    "    }\n" +
                    "->\n" +
                    " public void btnDeleteForm_Click(View view) {\n" +
                    "        Intent intent= getIntent();\n" +
                    "        db.delete(\"users\", \"name='\"+intent.getStringExtra(\"name\")+\"'\",null);\n" +
                    "        Intent i = new Intent(this, MainActivity.class);\n" +
                    "        startActivity(i);\n" +
                    "    }";
        }
        return "Error";
    }


    public String addJava(String pass){
        if (pass.equals(libPass)){
            return " EditText etName, etAge, etDescription;\n" +
                    "        etName = findViewById(R.id.etName);\n" +
                    "        etAge = findViewById(R.id.etAge);\n" +
                    "        etDescription = findViewById(R.id.etDescription);\n" +
                    "        Cursor cursor = db.rawQuery(\"SELECT * FROM users WHERE name='\"+etName.getText().toString()+\"'\",null);\n" +
                    "        if (cursor.getCount() == 0) {\n" +
                    "            ContentValues cv = new ContentValues();\n" +
                    "            cv.put(\"name\", etName.getText().toString());\n" +
                    "            cv.put(\"age\", etAge.getText().toString());\n" +
                    "            cv.put(\"description\", etDescription.getText().toString());\n" +
                    "            db.insert(\"users\", null,cv);\n" +
                    "            Toast.makeText(this, \"Inserted\", Toast.LENGTH_SHORT).show();\n" +
                    "            names.add(etName.getText().toString());\n" +
                    "            ages.add(etAge.getText().toString());\n" +
                    "            descriptions.add(etDescription.getText().toString());\n" +
                    "            CustomAdapter adapter = new CustomAdapter(names, ages, descriptions,getApplicationContext());\n" +
                    "            ListView lv = findViewById(R.id.lvUsers);\n" +
                    "            lv.setAdapter(adapter);\n" +
                    "        }\n" +
                    " else Toast.makeText(this, \"Такой уже есть(\", Toast.LENGTH_SHORT).show();";
        }
        return "null";
    }

    public String customList(String pass){
        if(pass.equals(libPass)){
            return "XML\n" +
                    " <LinearLayout\n" +
                    "        android:layout_width=\"match_parent\"\n" +
                    "        android:layout_height=\"wrap_content\" android:orientation=\"horizontal\">\n" +
                    "        <TextView\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:id=\"@+id/tvNameTemplate\"/>\n" +
                    "        <TextView\n" +
                    "            android:layout_width=\"wrap_content\"\n" +
                    "            android:layout_height=\"wrap_content\"\n" +
                    "            android:id=\"@+id/tvAgeTemplate\"/>\n" +
                    "    </LinearLayout>\n" +
                    "\n" +
                    "    <TextView\n" +
                    "        android:layout_width=\"wrap_content\"\n" +
                    "        android:layout_height=\"wrap_content\"\n" +
                    "        android:id=\"@+id/tvDescriptionTemplate\"/>\n" +
                    "->\n" +
                    "public class CustomAdapter extends BaseAdapter {\n" +
                    "    ArrayList<String> names, ages, descriptions;\n" +
                    "    Context context;\n" +
                    "\n" +
                    "    public CustomAdapter(ArrayList<String> names, ArrayList<String> ages, ArrayList<String> descriptions, Context context) {\n" +
                    "        this.names = names;\n" +
                    "        this.ages = ages;\n" +
                    "        this.descriptions = descriptions;\n" +
                    "        this.context = context;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public int getCount() {\n" +
                    "        return names.size();\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public Object getItem(int position) {\n" +
                    "        return null;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public long getItemId(int position) {\n" +
                    "        return position;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public View getView(int position, View convertView, ViewGroup parent) {\n" +
                    "        TextView tvNameTemplate, tvAgeTemplate, tvDescriptionTemplate;\n" +
                    "        View v = LayoutInflater.from(context).inflate(R.layout.users_template, null);\n" +
                    "        tvNameTemplate = v.findViewById(R.id.tvNameTemplate);\n" +
                    "        tvAgeTemplate = v.findViewById(R.id.tvAgeTemplate);\n" +
                    "        tvDescriptionTemplate = v.findViewById(R.id.tvDescriptionTemplate);\n" +
                    "        tvNameTemplate.setText(names.get(position));\n" +
                    "        tvAgeTemplate.setText(ages.get(position));\n" +
                    "        tvDescriptionTemplate.setText(descriptions.get(position));\n" +
                    "        return v;\n" +
                    "    }\n" +
                    "}";
        }
        return "Error";
    }



    public String sql(String pass){
        if (pass.equals(libPass)){
            return " db = getBaseContext().openOrCreateDatabase(\"mydb.db\",MODE_PRIVATE,null);\n" +
                    "        db.execSQL(\"CREATE TABLE IF NOT EXISTS users(name TEXT, age TEXT, description TEXT)\");\n" +
                    "\n" +
                    "        names = new ArrayList<>();\n" +
                    "        ages = new ArrayList<>();\n" +
                    "        descriptions = new ArrayList<>();\n" +
                    "\n" +
                    "        Cursor cursor = db.rawQuery(\"SELECT * FROM users\", null);\n" +
                    "        if (cursor.getCount() != 0) {\n" +
                    "            cursor.moveToFirst();\n" +
                    "            do {\n" +
                    "                names.add(cursor.getString(0));\n" +
                    "                ages.add(cursor.getString(1));\n" +
                    "                descriptions.add(cursor.getString(2));\n" +
                    "            }while (cursor.moveToNext());\n" +
                    "        }\n" +
                    "        CustomAdapter adapter = new CustomAdapter(names, ages, descriptions,getApplicationContext());\n" +
                    "        ListView lv = findViewById(R.id.lvUsers);\n" +
                    "        lv.setAdapter(adapter);";
        }

        return "Error";
    }

    public String xml(String pass){
        if (pass.equals(libPass)){
            return "public class MainActivity extends AppCompatActivity {\n" +
                    "\n" +
                    "    private TextView txt;\n" +
                    "    private ListView lv;\n" +
                    "    ArrayAdapter<String> adapter;\n" +
                    "    ArrayList<String> lst;\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "\n" +
                    "        // Важно!!! Иначе будет хуйня!\n" +
                    "        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();\n" +
                    "        StrictMode.setThreadPolicy(policy);\n" +
                    "\n" +
                    "        lv = findViewById(R.id.lstv);\n" +
                    "        lst = new ArrayList<>();\n" +
                    "\n" +
                    "        XmlParsing parsing = new XmlParsing();\n" +
                    "        parsing.execute();\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    public class XmlParsing extends AsyncTask<XmlPullParser, XmlPullParser, XmlPullParser> {\n" +
                    "\n" +
                    "        @Override\n" +
                    "        protected XmlPullParser doInBackground(XmlPullParser... xmlPullParsers) {\n" +
                    "            XmlPullParserFactory parseFactory;\n" +
                    "            HttpURLConnection connection;\n" +
                    "            try {\n" +
                    "                URL url = new URL(\"https://itbad.000webhostapp.com/myxml.xml\");\n" +
                    "                connection = (HttpURLConnection) url.openConnection();\n" +
                    "                parseFactory = XmlPullParserFactory.newInstance();\n" +
                    "                XmlPullParser parser = parseFactory.newPullParser();\n" +
                    "                InputStream is = connection.getInputStream();\n" +
                    "                parser.setInput(is, null);\n" +
                    "\n" +
                    "                return parser;\n" +
                    "\n" +
                    "            } catch (Exception e){\n" +
                    "                e.printStackTrace();\n" +
                    "            }\n" +
                    "            return null;\n" +
                    "        }\n" +
                    "\n" +
                    "        @Override\n" +
                    "        protected void onPostExecute(XmlPullParser parser) {\n" +
                    "            super.onPostExecute(parser);\n" +
                    "\n" +
                    "            try {\n" +
                    "                processParsing(parser);\n" +
                    "            } catch (Exception e) {\n" +
                    "\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "\n" +
                    "    private void processParsing(XmlPullParser parser) throws IOException, XmlPullParserException {\n" +
                    "        ArrayList<Player> players = new ArrayList<>();\n" +
                    "        int eventType = parser.getEventType();\n" +
                    "        Player currentPlayer = null;\n" +
                    "\n" +
                    "        while (eventType != XmlPullParser.END_DOCUMENT) {\n" +
                    "            String eltName = parser.getName();\n" +
                    "\n" +
                    "            switch (eventType) {\n" +
                    "                case XmlPullParser.START_TAG:\n" +
                    "                    eltName = parser.getName();\n" +
                    "\n" +
                    "                    if (\"Valute\".equals(eltName)) {\n" +
                    "                        currentPlayer = new Player();\n" +
                    "                        players.add(currentPlayer);\n" +
                    "                    } else if (currentPlayer != null) {\n" +
                    "                        if (\"NumCode\".equals(eltName)) {\n" +
                    "                            currentPlayer.NumCode = parser.nextText();\n" +
                    "                        } else if (\"CharCode\".equals(eltName)) {\n" +
                    "                            currentPlayer.CharCode = parser.nextText();\n" +
                    "                        } else if (\"Name\".equals(eltName)) {\n" +
                    "                            currentPlayer.Name = parser.nextText();\n" +
                    "                        } else if (\"Value\".equals(eltName)) {\n" +
                    "                            currentPlayer.Value = parser.nextText();\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                    break;\n" +
                    "            }\n" +
                    "            eventType = parser.next();\n" +
                    "        }\n" +
                    "\n" +
                    "        for (Player player : players) {\n" +
                    "            lst.add(player.CharCode + \" \" + player.Value + \" \" + player.Name);\n" +
                    "        }\n" +
                    "\n" +
                    "        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvItem, lst);\n" +
                    "        lv.setAdapter(adapter);\n" +
                    "\n" +
                    "    }";


        }

        return "Error";
    }



}
