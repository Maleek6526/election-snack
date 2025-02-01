from segno import helpers
qr_code = helpers.make_epc_qr(name="payment invoice", iban='7025284621', amount=5000, text="payment invoice description")
qr_code.save('invoice.png')