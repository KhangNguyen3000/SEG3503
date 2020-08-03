#Khang Nguyen 300007277

import unittest
import calculateCdnSaleTaxes

class calculatedCdnSaleTaxesTest(unittest.TestCase):

    def test_case1(self):
        expected = (0.0, 0.0, 0.0, 0.0)
        prov = "AB"
        amt = 0
        fedExmpt = True
        provExmp = False
        self.assertEqual(expected, calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp))

    def test_case2(self):
        prov = ""
        amt = 142
        fedExmpt = True
        provExmp = True
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

    def test_case3(self):
        prov = "Khang"
        amt = 123
        fedExmpt = True
        provExmp = False
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

    def test_case4(self):
        prov = "NT"
        amt = -1
        fedExmpt = True
        provExmp = False
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

    def test_case5(self):
        prov = "BC"
        amt = 20
        fedExmpt = None
        provExmp = False
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

    def test_case6(self):
        prov = "OC"
        amt = 30
        fedExmpt = True
        provExmp = None
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

    def test_case7(self):
        prov = "SK"
        amt = 543
        fedExmpt = "allo"
        provExmp = False
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

    def test_case8(self):
        prov = "YT"
        amt = 600
        fedExmpt = "allo"
        provExmp = False
        with self.assertRaises(ValueError):
            calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp)

#Resultats Escompter

    def test_case9(self):
        expected = (1234.0, 0.0, 0.0, 0.0)
        prov = "NL"
        amt = 1234
        fedExmpt = True
        provExmp = True
        self.assertEqual(expected, calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp))

    def test_case10(self):
        expected = (16298603.59, 1875060.59, 0.0, 0.0)
        prov = "ON"
        amt = 14423543
        fedExmpt = False
        provExmp = True
        self.assertEqual(expected, calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp))

    def test_case11(self):
        expected = (496869.0615, 0.0, 21607.7, 43107.36149999999)
        prov = "QC"
        amt = 432154
        fedExmpt = False
        provExmp = False
        self.assertEqual(expected, calculateCdnSaleTaxes.calculateSaleTax(prov, amt, fedExmpt, provExmp))
