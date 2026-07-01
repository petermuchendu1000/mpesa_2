package com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.daos.favorite.MpesaFavoriteDao;
import com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteUtil;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00140\tH\u0002J\u0016\u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/favorites/MpesaFavoritesRepository;", "", "mpesaFavoriteDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/favorite/MpesaFavoriteDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/favorite/MpesaFavoriteDao;)V", "insertFavorites", "", "favorites", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomBean;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteListPosition", GriverCacheDao.COLUMN_CACHE_ID, "", "position", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavorite", "favorite", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "(Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavorites", "Lkotlinx/coroutines/flow/Flow;", "deduplicateFavorites", "deleteFavorite", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaFavoritesRepository {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private final MpesaFavoriteDao copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository", f = "MpesaFavoritesRepository.kt", i = {0, 0}, l = {34, 40}, m = "updateFavorite", n = {"this", "favorite"}, s = {"L$0", "L$1"})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int equals = 0;
        private static int getAsAtTimestamp = 1;
        int ShareDataUIState;
        Object component1;
        Object component3;
        Object copydefault;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 37;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.component1 = obj;
            this.ShareDataUIState |= Integer.MIN_VALUE;
            MpesaFavoritesRepository mpesaFavoritesRepository = MpesaFavoritesRepository.this;
            if (i3 != 0) {
                mpesaFavoritesRepository.updateFavorite(null, this);
                obj2.hashCode();
                throw null;
            }
            Object objUpdateFavorite = mpesaFavoritesRepository.updateFavorite(null, this);
            int i4 = equals + 5;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return objUpdateFavorite;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository", f = "MpesaFavoritesRepository.kt", i = {0, 0, 1}, l = {19, 21}, m = "insertFavorites", n = {"this", "favorite", "this"}, s = {"L$0", "L$2", "L$0"})
    static final class component3 extends ContinuationImpl {
        private static int component4 = 1;
        private static int equals;
        Object ShareDataUIState;
        Object component1;
        Object component2;
        Object component3;
        int copydefault;

        component3(Continuation<? super component3> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = equals + 9;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState = obj;
            this.copydefault |= Integer.MIN_VALUE;
            MpesaFavoritesRepository mpesaFavoritesRepository = MpesaFavoritesRepository.this;
            component3 component3Var = this;
            if (i3 != 0) {
                return mpesaFavoritesRepository.insertFavorites(null, component3Var);
            }
            mpesaFavoritesRepository.insertFavorites(null, component3Var);
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository", f = "MpesaFavoritesRepository.kt", i = {0, 0}, l = {27, 28}, m = "updateFavoriteListPosition", n = {"this", "position"}, s = {"L$0", "I$0"})
    static final class copydefault extends ContinuationImpl {
        private static int getAsAtTimestamp = 0;
        private static int getRequestBeneficiariesState = 1;
        int component1;
        Object component2;
        int component3;
        Object copydefault;

        copydefault(Continuation<? super copydefault> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 3;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault = obj;
            this.component3 |= Integer.MIN_VALUE;
            Object objUpdateFavoriteListPosition = MpesaFavoritesRepository.this.updateFavoriteListPosition(null, 0, this);
            int i4 = getRequestBeneficiariesState + 9;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return objUpdateFavoriteListPosition;
        }
    }

    @Inject
    public MpesaFavoritesRepository(MpesaFavoriteDao mpesaFavoriteDao) {
        Intrinsics.checkNotNullParameter(mpesaFavoriteDao, "");
        this.copydefault = mpesaFavoriteDao;
    }

    public static final List access$deduplicateFavorites(MpesaFavoritesRepository mpesaFavoritesRepository, List list) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<FavoriteFriendsBean> listComponent3 = mpesaFavoritesRepository.component3(list);
        int i4 = component2 + 35;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return listComponent3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r10 = r3;
        r11 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertFavorites(java.util.List<com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomBean> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.insertFavorites(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateFavoriteListPosition(java.lang.String r20, int r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            boolean r3 = r1 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.copydefault
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == r4) goto L1d
            r3 = r1
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$copydefault r3 = (com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.copydefault) r3
            int r5 = r3.component3
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L1d
            int r1 = r3.component3
            int r1 = r1 + r6
            r3.component3 = r1
            goto L2b
        L1d:
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$copydefault r3 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$copydefault
            r3.<init>(r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component1
            int r1 = r1 + 61
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component2 = r5
            int r1 = r1 % r2
        L2b:
            java.lang.Object r1 = r3.copydefault
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.component3
            r7 = 0
            if (r6 == 0) goto L63
            if (r6 == r4) goto L59
            if (r6 != r2) goto L51
            int r3 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component2
            int r3 = r3 + 49
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component1 = r4
            int r3 = r3 % r2
            if (r3 != 0) goto L4a
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lbe
        L4a:
            kotlin.ResultKt.throwOnFailure(r1)
            r7.hashCode()
            throw r7
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L59:
            int r4 = r3.component1
            java.lang.Object r6 = r3.component2
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository r6 = (com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L8d
        L63:
            kotlin.ResultKt.throwOnFailure(r1)
            com.huawei.digitalpayment.consumer.base.database.daos.favorite.MpesaFavoriteDao r1 = r0.copydefault
            r3.component2 = r0
            r6 = r21
            r3.component1 = r6
            r3.component3 = r4
            r4 = r20
            java.lang.Object r1 = r1.getFavoriteItemById(r4, r3)
            if (r1 != r5) goto L82
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component1
            int r1 = r1 + 65
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component2 = r3
            int r1 = r1 % r2
            return r5
        L82:
            int r4 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component2
            int r4 = r4 + 13
            int r8 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component1 = r8
            int r4 = r4 % r2
            r4 = r6
            r6 = r0
        L8d:
            r8 = r1
            com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity r8 = (com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity) r8
            if (r8 != 0) goto L95
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L95:
            com.huawei.digitalpayment.consumer.base.database.daos.favorite.MpesaFavoriteDao r1 = r6.copydefault
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.Integer r16 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            r17 = 63
            r18 = 0
            com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity r4 = com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity.copy$default(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            r3.component2 = r7
            r3.component3 = r2
            java.lang.Object r1 = r1.updateFavoriteItem(r4, r3)
            if (r1 != r5) goto Lbe
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component2
            int r1 = r1 + 75
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.component1 = r3
            int r1 = r1 % r2
            return r5
        Lbe:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.updateFavoriteListPosition(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateFavorite(com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.updateFavorite(com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<FavoriteFriendsBean> component3(List<FavoriteFriendsBean> list) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = component2 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        for (FavoriteFriendsBean favoriteFriendsBean : CollectionsKt.sortedWith(list, new Comparator() {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final int compare(T t, T t2) {
                int i4 = 2 % 2;
                int i5 = component2 + 5;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                int iCompareValues = ComparisonsKt.compareValues(Long.valueOf(((FavoriteFriendsBean) t).getCreateTime()), Long.valueOf(((FavoriteFriendsBean) t2).getCreateTime()));
                int i7 = component3 + 105;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                return iCompareValues;
            }
        })) {
            String favoriteUniqueIdentifier = FavoriteUtil.INSTANCE.getFavoriteUniqueIdentifier(favoriteFriendsBean);
            if (favoriteUniqueIdentifier != null) {
                int i4 = component2 + 69;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    linkedHashMap.put(favoriteUniqueIdentifier, favoriteFriendsBean);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                linkedHashMap.put(favoriteUniqueIdentifier, favoriteFriendsBean);
            }
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    public final Object deleteFavorite(String str, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.copydefault.deleteFavoriteItem(str, continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            throw null;
        }
        Object objDeleteFavoriteItem = this.copydefault.deleteFavoriteItem(str, continuation);
        if (objDeleteFavoriteItem != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i3 = component1 + 73;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        return objDeleteFavoriteItem;
    }

    public final Flow<List<FavoriteFriendsBean>> getAllFavorites() {
        int i = 2 % 2;
        final Flow<List<MpesaFavoriteEntity>> allFavorites = this.copydefault.getAllFavorites();
        final Flow<List<? extends FavoriteFriendsBean>> flow = new Flow<List<? extends FavoriteFriendsBean>>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;
                final FlowCollector copydefault;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1$2", f = "MpesaFavoritesRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component3 = 1;
                    private static int copydefault;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        Object objEmit;
                        int i = 2 % 2;
                        int i2 = component3 + 55;
                        copydefault = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i3 != 0) {
                            objEmit = anonymousClass2.emit(null, this);
                            int i4 = 91 / 0;
                        } else {
                            objEmit = anonymousClass2.emit(null, this);
                        }
                        int i5 = component3 + 3;
                        copydefault = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objEmit;
                        }
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.component2
                        int r1 = r1 + 39
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                        int r1 = r1 % r0
                        if (r1 != 0) goto L99
                        boolean r1 = r9 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r1 == 0) goto L33
                        r1 = r9
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r2 = r1.label
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 & r3
                        if (r2 == 0) goto L33
                        int r9 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.ShareDataUIState
                        int r9 = r9 + 41
                        int r2 = r9 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.component2 = r2
                        int r9 = r9 % r0
                        if (r9 != 0) goto L2d
                        int r9 = r1.label
                        int r9 = r9 - r3
                        r1.label = r9
                        goto L38
                    L2d:
                        int r9 = r1.label
                        int r9 = r9 + r3
                        r1.label = r9
                        goto L38
                    L33:
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1$2$1
                        r1.<init>(r9)
                    L38:
                        java.lang.Object r9 = r1.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r3 = r1.label
                        r4 = 1
                        if (r3 == 0) goto L51
                        if (r3 != r4) goto L49
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L96
                    L49:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L51:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.copydefault
                        r3 = r1
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        java.util.List r8 = (java.util.List) r8
                        java.lang.Iterable r8 = (java.lang.Iterable) r8
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r5 = 10
                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r5)
                        r3.<init>(r5)
                        java.util.Collection r3 = (java.util.Collection) r3
                        java.util.Iterator r8 = r8.iterator()
                    L6e:
                        boolean r5 = r8.hasNext()
                        if (r5 == 0) goto L8b
                        java.lang.Object r5 = r8.next()
                        com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity r5 = (com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity) r5
                        com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean r5 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepositoryKt.toFriendBean(r5)
                        r3.add(r5)
                        int r5 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.component2
                        int r5 = r5 + 13
                        int r6 = r5 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.ShareDataUIState = r6
                        int r5 = r5 % r0
                        goto L6e
                    L8b:
                        java.util.List r3 = (java.util.List) r3
                        r1.label = r4
                        java.lang.Object r8 = r9.emit(r3, r1)
                        if (r8 != r2) goto L96
                        return r2
                    L96:
                        kotlin.Unit r8 = kotlin.Unit.INSTANCE
                        return r8
                    L99:
                        boolean r8 = r9 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        r8 = 0
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super List<? extends FavoriteFriendsBean>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = allFavorites.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i3 = component1;
                int i4 = i3 + 95;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 89;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return objCollect;
                }
                throw null;
            }
        };
        Flow<List<FavoriteFriendsBean>> flow2 = (Flow) new Flow<List<? extends FavoriteFriendsBean>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component3 = 0;
                private static int copydefault = 1;
                final FlowCollector ShareDataUIState;
                final MpesaFavoritesRepository component2;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2$2", f = "MpesaFavoritesRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component3 = 1;
                    private static int copydefault;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = component3 + 111;
                        copydefault = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass2.this.emit(null, this);
                        int i4 = component3 + 113;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        r2 = 1
                        r1 = r1 ^ r2
                        if (r1 == r2) goto L2a
                        r1 = r7
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.AnonymousClass1) r1
                        int r3 = r1.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r3 & r4
                        if (r3 == 0) goto L2a
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.copydefault
                        int r7 = r7 + 93
                        int r3 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.component3 = r3
                        int r7 = r7 % r0
                        if (r7 == 0) goto L24
                        int r7 = r1.label
                        int r7 = r7 % r4
                        r1.label = r7
                        goto L38
                    L24:
                        int r7 = r1.label
                        int r7 = r7 + r4
                        r1.label = r7
                        goto L38
                    L2a:
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2$2$1
                        r1.<init>(r7)
                        int r7 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.component3
                        int r7 = r7 + 91
                        int r3 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.copydefault = r3
                        int r7 = r7 % r0
                    L38:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r4 = r1.label
                        if (r4 == 0) goto L5e
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.copydefault
                        int r6 = r6 + 97
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.component3 = r1
                        int r6 = r6 % r0
                        if (r6 == 0) goto L50
                        if (r4 != 0) goto L56
                        goto L52
                    L50:
                        if (r4 != r2) goto L56
                    L52:
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L84
                    L56:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L5e:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.ShareDataUIState
                        r4 = r1
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        java.util.List r6 = (java.util.List) r6
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository r4 = r5.component2
                        java.util.List r6 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository.access$deduplicateFavorites(r4, r6)
                        r1.label = r2
                        java.lang.Object r6 = r7.emit(r6, r1)
                        if (r6 != r3) goto L84
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.component3
                        int r6 = r6 + 125
                        int r7 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.copydefault = r7
                        int r6 = r6 % r0
                        if (r6 == 0) goto L82
                        return r3
                    L82:
                        r6 = 0
                        throw r6
                    L84:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites.MpesaFavoritesRepository$getAllFavorites$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector, MpesaFavoritesRepository mpesaFavoritesRepository) {
                    this.ShareDataUIState = flowCollector;
                    this.component2 = mpesaFavoritesRepository;
                }
            }

            @Override
            public Object collect(FlowCollector<? super List<? extends FavoriteFriendsBean>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i3 = component3 + 19;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i5 = component2 + 5;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        };
        int i2 = component2 + 7;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return flow2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 1;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }
}
