package team.rvn.lib;

public class MyClass {

    String libPass = "Mallesh";


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

}
