import gspread
from oauth2client.service_account import ServiceAccountCredentials
from pprint import pprint

scope = ["https://spreadsheets.google.com/feeds", 'https://www.googleapis.com/auth/spreadsheets',
         "https://www.googleapis.com/auth/drive.file", "https://www.googleapis.com/auth/drive"]

#TODO: YOU NEED TO PUT YOUR OWN CREDENTIALS FOR YOUR GOOGLE SHEET HERE...
app_creds_dictionary = {
  "type": "",
  "project_id": "",
  "private_key_id": "",
  "private_key": "",
  "client_id": "",
  "auth_uri": "",
  "token_uri": "https://oauth2.googleapis.com/token",
  "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
  "client_x509_cert_url": ""
}

creds = ServiceAccountCredentials.from_json_keyfile_dict(app_creds_dictionary, scope)

client = gspread.authorize(creds)

#TODO: SPECIFY YOUR SHEETS AND GOOGLE FILE BELOW
sheet = client.open("").sheet1
inquiry = client.open("").worksheet('Sheet2')
buy = client.open("").worksheet('')

answer = 'null'

sheet.get()
number = 1
name = 2
info = 3
stock = 4
bought = 5

questrow = 1
questcol = 1

buyrow = 1
buycol = 1

while answer != "quit":
    answer = input("[INTRO]what would you like to do(?, info, quit, buy)")
    if answer == 'info':
        infofind = int(input("[INFO]what number..."))
        if infofind > 148 or infofind < 1:
            print("[ERROR]error, too high of a search value... ")
        else:
            print("[INFO-RETRIEVAL]working...")
            display = sheet.row_values(infofind)
            pprint(display)
    elif answer == '?':
        who = input("[INQUIRY]who asked the question?")
        question = input("[INQUIRY]what is the question")
        inquiry.update_cell(questrow, questcol, who)
        questcol += 1
        inquiry.update_cell(questrow, questcol, question)
        questrow += 1
        questcol -= 1
    elif answer == 'buy':
        buyer = input("[BUY]who bought the item?")
        purchase = input("[BUY]what was the purchase?")
        try:
            quantity = int(str(sheet.cell(purchase, bought))[12])
        except ValueError:
            sheet.update_cell(purchase, bought, 0)
        finally:
            quantity = int(str(sheet.cell(purchase, bought))[12])
            sheet.update_cell(purchase, bought, quantity+1)
        buy.update_cell(buyrow, buycol, buyer)
        buycol += 1
        inquiry.update_cell(questrow, questcol, purchase)
        buyrow += 1
        buycol -= 1
    elif answer == 'quit':
        exit()
    else:
        print("[ERROR-CRIT]INVALID INPUT")
